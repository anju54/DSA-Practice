package com.revise;

import java.util.Arrays;
import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-ii/
public class NGE503 {
    public static void main(String[] args) {
        int nums1[] = new int[]{1,2,1};

        nextGreaterElements(nums1);
    }
    public static int[] nextGreaterElements(int[] nums) {

        // check for nums.length = 1
        if(nums.length == 1)
            return new int[]{-1};

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int nge[] = new int[n];

        stack.push(nums[n-2]);

        for(int i = n - 3;i>=0;i--){
            if(stack.peek() < nums[i]){
                stack.pop();
            }
            stack.push(nums[i]);
           // stack.pop();
        }

        for(int i = n - 1;i>=0;i--){

            if(stack.peek() > nums[i])
                nge[i] = stack.peek();
            else if(stack.size() > 0 && stack.peek() <= nums[i]){
                while(stack.size() > 0 && stack.peek() <= nums[i])
                    stack.pop();

                if(stack.size() == 0)
                    nge[i] = -1;
                else if(stack.peek() > nums[i])
                    nge[i] = stack.peek();
            }
            stack.push(nums[i]);
        }

        System.out.println(Arrays.toString(nge));

        return nge;
    }
}
