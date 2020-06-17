package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCode1 {

    public static int[] twoSumEfficientSoln(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            //before inserting into the map try to find if the difference of the target and the current number is already in map
            if(map.containsKey(target - nums[i]))
            {
                //if yes return
                return new int[]{i,map.get(target - nums[i])};
            }
            //if not insert into the map
            map.put(nums[i],i);
        }
        return null;
    }

    // brute force solution
    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<=nums.length-1; j++){
                if ( nums[i]+nums[j]==target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,8,4};
        int target = 12;
        int res[] = twoSumEfficientSoln(arr,target);

        for(int j=0;j<res.length;j++){
            System.out.println(res[j]);
        }
    }
}
