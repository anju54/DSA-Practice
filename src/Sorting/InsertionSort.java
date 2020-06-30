package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int arr[]) {


        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{30,10,50,20,60,40};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }
}
