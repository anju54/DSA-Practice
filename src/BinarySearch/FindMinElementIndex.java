package BinarySearch;

// leetcode 153
// Find Minimum in Rotated Sorted Array ( arr is rotated between 1 to n times
public class FindMinElementIndex {

    public static void main(String[] args) {

        // array is rotated
        int arr[] = new int[]{4,5,6,7,0,1,2};// [5,4,3,2,1] not a valid test case

        int result = findMin(arr);
        System.out.println(result);

    }

    // Find min element index in sorted rotated array
    public static int findMin(int[] nums) {

        int n = nums.length;
        if(n==1)
            return nums[0];
//        if(n==2)
//            return nums[0] < nums[1] ? nums[0] : nums[1];
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            // array is not rotated
            if(nums[start]<nums[end])
                return nums[start];

            int mid = start + (end - start) / 2;

            int next = (mid + 1) % n ;
            int prev = (mid + n - 1) % n ;

            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return nums[mid];
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return -1;
    }
}
