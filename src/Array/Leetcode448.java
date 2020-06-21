package Array;

import java.util.ArrayList;
import java.util.List;

// Ques link - https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class Leetcode448 {

    // Efficient solution without extra space and linear time complexity
    public static List<Integer> findDisappearedNumbers(int[] nums) {


        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs( nums[i] ) - 1 ;
            if(nums[index]>0){
                nums[index] = nums[index] * -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                ans.add(i+1);
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};

        List<Integer> res = findDisappearedNumbers(arr);
        for(Integer i : res){
            System.out.println(i);
        }
    }
}
