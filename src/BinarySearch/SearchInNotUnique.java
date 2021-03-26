package com.array.binarySearch;

public class SearchInNotUnique {

    public static void main(String[] args) {

        int arr[] = new int[]{2,3,3,4,5,5};
        int key = 3;

        int result = search(arr,key);
        System.out.println(result);

    }

    // Find key in sorted non unique array
    public static int search(int arr[],int key){

        int low = 0;
        int high = arr.length - 1;

        int mid =  low + ((high-low)/2);

        while (low<=high){
            if(arr[mid] <= key){
                low = mid+1;
            }else
                high = mid - 1;

            if(key==arr[mid])
                return mid;
        }
        return 0;
    }
}
