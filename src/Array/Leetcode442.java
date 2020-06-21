package Array;

import java.util.*;

// Ques link - https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Leetcode442 {

    // TC - O(n) SC - O(1) constant time
    public static List<Integer> findDuplicates3(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs( nums[i] ) - 1 ;
            if(nums[index]<0){
                ans.add(Math.abs(nums[i]));
            }else{
                nums[index] = nums[index] * -1;
            }
        }
        return ans;
    }

    // TC - O(nlogn) SC - O(1)
    public static List<Integer> findDuplicates2(int[] nums) {

        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length-1;){
            if(nums[i]==nums[i+1]){
                ans.add(nums[i]);
                i += 2;
            }else{
                i +=1;
            }
        }
        return ans;
    }

    // TC - O(n) SC - O(n)
    public static List<Integer> findDuplicates1(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(Integer k: nums){
            Integer count = map.get(k);
            map.put(k,count==null ? 1 : ++count);
        }
        for(Map.Entry<Integer, Integer> k: map.entrySet()){
            if(k.getValue()>1)
                ans.add(k.getKey());
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};

        List<Integer> res = findDuplicates3(arr);
        for(Integer i : res){
            System.out.println(i);
        }

    }
}
