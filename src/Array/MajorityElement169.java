package Array;

import java.util.HashMap;

public class MajorityElement169 {

    public static int findCandidate(int[] nums) {

        int majorElement = 0;
        int count = 1;

        for(int i=1;i<nums.length;i++){
            if(nums[majorElement]==nums[i]){
                count++;
            }else{
                count--;

            }
            if(count==0) {

                majorElement = i;
                count++;
            }
        }
        return nums[majorElement];
    }

    // Efficient solution using Boyer-Moore Majority voting algorithm
    public static int majorityElement1(int[] nums) {
        int cand = findCandidate(nums);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(cand==nums[i])
                count++;
        }
        if(count >= nums.length/2)
            return cand;
        else
            return -1;
    }


    public static int majorityElement(int[] nums) {

        //int half = (int) Math.floor( nums.length/2 );
        //System.out.println("half = "+half);
        int res = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) +1);
            }else
                hm.put(nums[i],1);
        }

        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(max < hm.get(nums[i])) {
                max = hm.get(nums[i]);
                res = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,3,4};
        System.out.println( "result = "+ majorityElement1(arr) );

    }
}
