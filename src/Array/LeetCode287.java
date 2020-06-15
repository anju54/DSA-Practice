package Array;

import java.util.HashSet;
import java.util.Set;

public class LeetCode287 {

    public static void main(String[] args) {

        int[] arr = new int[]{3,1,3,4,2};
        System.out.println( findDuplicateUsingHashSet(arr) );
    }

    /**
     * Using two pointer
     * @param nums
     * @return
     */
    public static int findDuplicate(int[] nums) {

        int len = nums.length;
        int end = len - 1;

        for(int start=0; start<len;){

            if( nums[start] == nums[end] && start!=end )
                return nums[start];
            else if(start==len-1)
            {
                end--;
                start = 0;
                continue;
            }else
                start++;
        }
        return 0;
    }

    /**
     * Using hash set
     * @param nums
     * @return
     */
    public static int findDuplicateUsingHashSet(int[] nums){
        Set<Integer> set1 = new HashSet<>();
        for(int i : nums){
            if(!set1.add(i)){
                return i;
            }
        }
        return 0;
    }
}
