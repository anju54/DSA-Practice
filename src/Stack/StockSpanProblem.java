package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {

    public static Integer[] calSpan(Integer[] arr){

        Stack<Integer> stack = new Stack<>();

        // First store the index value for greatest element in left side
        // and then subtract the i index value to ans[i] value
        Integer ans[] = new Integer[arr.length];

        for(int i=0;i<arr.length;i++){
            if(stack.empty())
                ans[i] = -1;
            else if(arr[stack.peek()]>arr[i])
                ans[i] = stack.peek();
            else if(arr[stack.peek()]<=arr[i] && !stack.empty()){
                while (arr[stack.peek()]<=arr[i] && !stack.empty()){
                    stack.pop();
                }
                if(stack.size()==0)
                    ans[i] = -1;
                else
                    ans[i] = stack.peek();
            }
            ans[i] = i - ans[i];
            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Integer [] arr = {100,80,60,70,60,75,85};

        System.out.println(Arrays.asList(calSpan(arr)));
    }
}
