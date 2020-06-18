package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Ques link - https://leetcode.com/problems/3sum/

public class ThreeSumLeetCode {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int total = nums[i] + nums[start] + nums[end] ;
                if ( total < 0 ){
                    start = start + 1;
                }else if( total > 0){
                    end = end - 1;
                }else{
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    while (start < end && nums[start] == nums[start + 1])
                        start++;
                    while (start < end && nums[end] == nums[end - 1])
                        end--;
                    start++;
                    end--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2,-2,1,1,2};
        List<List<Integer>> res = threeSum(arr);
    }
}