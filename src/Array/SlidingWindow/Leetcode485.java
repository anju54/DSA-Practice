package Array.SlidingWindow;

// Given a binary array, find the maximum number of consecutive 1s in this array. i.e [1,1,0,1,1,1]
public class Leetcode485 {

    public int findMaxConsecutiveOnes(int[] nums) {

        int start = 0;
        int maxLen = 0;

        for(int end=0;end<nums.length;end++){

            if(nums[end]==0){
                start = end + 1;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}
