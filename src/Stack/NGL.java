package Stack;

import java.util.Arrays;
import java.util.Stack;

// NGL | Nearest Greater to left
public class NGL {

    public static Integer[] calNgl(Integer[] arr){

        Stack<Integer> stack = new Stack<>();

        Integer ans[] = new Integer[arr.length];

        for(int i=0;i<arr.length;i++){
            if(stack.empty())
                ans[i] = -1;
            else if(stack.peek()>arr[i])
                ans[i]= stack.peek();
            else if(stack.peek()<=arr[i]){
                // pop the top till stack is not empty and  top is lesser than the current element
                while( stack.peek()<=arr[i] && !stack.empty()){
                    stack.pop();
                }
                // so now loop has terminated so now check if stack is empty thats why loop has terminated
                if(stack.empty())
                    ans[i]=-1;
                else // otherwise the top item is bigger than the current so loop has terminated
                    ans[i] = stack.peek();
            }
        stack.push(arr[i]);
        }
    return ans;
    }

    public static void main(String[] args) {
        Integer [] arr = {40, 20, 30, 10};

        System.out.println(Arrays.asList(calNgl(arr)));
    }
}
