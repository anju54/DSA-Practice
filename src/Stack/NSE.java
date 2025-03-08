package stack;

import java.util.Arrays;
import java.util.Stack;

// checking the smallest element in the right side
//Given the input array {4, 5, 2, 10, 8}, the output will now correctly be:
//        [2, 2, -1, 8, -1]
public class NSE {

    public static void main(String[] args) {

        int[] arr ={4,5,2,10,8};
        System.out.println("input .."+Arrays.toString(arr));
        nextSmallerElementRight(arr);
        nextSmallerElementLeftSide(arr);
    }
    public static void nextSmallerElementRight(int[] num) { // NSE

        int[] nse = new int[num.length];
        Arrays.fill(nse, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = num.length-1; i >= 0 ; i--) {

            while (!stack.empty() && stack.peek() >= num[i]){
                stack.pop();
            }
            if ( !stack.empty()){
                nse[i] = stack.peek();
            }
            stack.push(num[i]);
        }
        System.out.println(Arrays.toString(nse));
    }

    public static void nextSmallerElementLeftSide(int[] num) { // PSE

        int[] nse = new int[num.length];
        Arrays.fill(nse, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num.length; i++) {
            while (!stack.empty() && stack.peek() >= num[i])
                stack.pop();
            if ( !stack.empty()){
                nse[i] = stack.peek();
            }
            stack.push(num[i]);
        }
        System.out.println(Arrays.toString(nse));;
    }

}
