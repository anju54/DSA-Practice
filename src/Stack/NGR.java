package Stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

// Nearest greatest right or next largest element
public class NGR {

    // TC - O (n) SC - O ( n ) extra space for stack
    public static int[] findNearestGreatestRightUsingStack(int[] arr){
        int len = arr.length;
        int[] ans = new int[len];

        Stack<Integer> stack = new Stack<>();
        for(int i=len-1;i>=0;i--){
            if(stack.empty()) {
                ans[i] = -1;
            }
            else if(stack.peek()>arr[i]){
                ans[i] = stack.peek();
            }else if(stack.size()>0 && stack.peek()<=arr[i]){
                while (stack.size()>0 && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.size()==0)
                    ans[i] = -1;
                else
                    ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }

        //Collections.reverse(Arrays.asList(ans));
        return ans;
    }

    // TC - O ( n^2 ) SC - O ( 1 ) we will not count output array in space complexity
    public static int[] getNearestGreatest(int[] arr){

        int len = arr.length;
        int[] ans = new int[len];

        for(int i=0;i<len;i++){
            int first = arr[i];
            if(i==len-1)
                ans[i] = -1;
            for(int j=i+1;j<len;j++){
                if(first<arr[j]) {
                    ans[i] = arr[j];
                    break;
                }
                if(j==len-1)
                    ans[i] = -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,3,2,4};
        arr = findNearestGreatestRightUsingStack(arr);

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
