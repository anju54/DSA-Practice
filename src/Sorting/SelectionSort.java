package Sorting;

import java.util.Arrays;

public class SelectionSort {

    // TC - O ( n^2 ) SC - O (1)
    public static int[] selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{30,10,50,20,60,40};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }


}
