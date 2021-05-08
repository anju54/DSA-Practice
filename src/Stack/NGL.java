package Stack;

import java.util.Arrays;
import java.util.Stack;

// NGL Next Greater Element |
public class NGL {

    public static Integer[] calNgl(Integer[] arr){

        Stack<Integer> stack = new Stack<>();

        Integer ans[] = new Integer[arr.length];

        for (int i=arr.length-1;i>=0;i--){
            if (stack.isEmpty())
                ans[i] = -1;
            else if (stack.peek() > arr[i]) {
                ans[i] = stack.peek();
                //System.out.println(ans[i]);
            }
            else{
                while ( stack.size()>0 && stack.peek() <= arr[i] ){
                    stack.pop();
                }
                if (stack.size() == 0)
                    ans[i] = -1;
                else
                    ans[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

//        for(int i=0;i<arr.length;i++){
//            if(stack.empty())
//                ans[i] = -1;
//            else if(stack.peek()>arr[i])
//                ans[i]= stack.peek();
//            else if(stack.peek()<=arr[i]){
//                // pop the top till stack is not empty and  top is lesser than the current element
//                while( stack.peek()<=arr[i] && !stack.empty()){
//                    stack.pop();
//                }
//                // so now loop has terminated so now check if stack is empty thats why loop has terminated
//                if(stack.empty())
//                    ans[i]=-1;
//                else // otherwise the top item is bigger than the current so loop has terminated
//                    ans[i] = stack.peek();
//            }
//        stack.push(arr[i]);
//        }
    return ans;
    }

    public static void main(String[] args) {
        Integer arr[]= {1, 3, 2, 4};

        System.out.println(Arrays.asList(calNgl(arr)));
    }
}
