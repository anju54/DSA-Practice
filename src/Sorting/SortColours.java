package Sorting;

import java.util.Arrays;

public class SortColours {

    public static void main(String[] args) {

        int arr[] = new int[]{2,0,2,1,1,0};
        System.out.println(Arrays.toString(sort(arr)));

    }

    public static int[] sort(int[] nums){

        int len = nums.length;
        int start = 0;
        int mid = 0;
        int end = len -1;
        while (mid<=end){

            if(nums[mid]==0){
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                mid++;
                start++;
            }
            else if(nums[mid]==2){
                int temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
                //mid++;
            }else
                mid+=1;
        }
        return nums;
    }

    private static void swap(int l,int h){

    }

    public static int[] bubbleSort(int[] arr){

       // int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j= 0; j < arr.length-1; j++) {
                if( arr[j]>arr[j+1]){
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
