package Array;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumberLeetCode {

    // TC - O(n) SC = O(1)
    public int singleNumber3(int[] nums) {

        int xor = 0;
        for (int num : nums)
            xor ^= num;
        return xor;
    }

    public static int singleNumber2(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //<number, count>
        for(Integer k : nums){
            Integer count = map.get(k);
            map.put(k,count==null? 1 : ++count);
        }
        //traverse map
        for(Integer k : map.keySet()){
            if(map.get(k) == 1) return k;
        }
        return -1;
    }

    // Brute Force 1 - Using Sorting - TC = O(nlogn), SC = O(1)
    public static int singleNumber1(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;){

            if(i==nums.length-1)
                return nums[i];
            if ( i!=nums.length-1 && nums[i]!=nums[i+1] )
                return nums[i];

            i +=2;
        }
        return 0;
    }

    // Brute Force 1 - Using HashMap - TC = O(n), SC = O(n)
    public static int singleNumber(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        for(int i=0;i<nums.length;i++){

            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1)
                res = nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,2,1,2};
        int res = singleNumber2(arr);
        System.out.println(res);
    }
}




