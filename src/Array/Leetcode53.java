package Array;

public class Leetcode53 {

    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4}; // arr = {-1}
        int res = maxSubArray(arr);
        int res1 = maxSubArrayOptimal(arr);
        System.out.println(res1);
    }

    // kadane algo Tc - O(n)
    public static int maxSubArrayOptimal(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){

            sum = sum + nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }

    // TC - O(n3)
    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum = 0;
                for(int k=i;k<=j;k++){
                    sum += nums[k];
                    maxSum = Math.max(sum,maxSum);
                }
            }
        }
        return maxSum;
    }

    // TC - O(n2)
    public static int maxSubArray1(int[] nums) {

        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                maxSum = Math.max(sum,maxSum);

            }
        }

        return maxSum;
    }
}
