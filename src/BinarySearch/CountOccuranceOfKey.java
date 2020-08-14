package BinarySearch;

public class CountOccuranceOfKey {

    public static void main(String[] args) {
        int arr[] = {3};
        int n = arr.length;
        int x = 2;
        int mid = search(arr,x);
        System.out.print(countOccurances(mid,arr, x));
    }

    private static int search(int[] nums,int target){

        int l = 0;
        int h = nums.length-1;
        int mid = 0;

        while (l<=h){
            mid = l - (l+h)/2;

            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>=target)
                h = mid-1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static int countOccurances(int mid,int[] nums,int target){

        int count = 1;
        if(mid==-1)
            return mid;
        else{

            // find in left side
            int left = mid-1;
            while (left>=0 && nums[left]==target){
                count++;
                left--;
            }
            // find in right side
            int right = mid +1;
            while (right<nums.length && nums[right]==target){
                count++;
                right++;
            }
        }
        return count;
    }
}
