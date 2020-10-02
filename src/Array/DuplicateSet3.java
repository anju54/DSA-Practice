package Array;

public class DuplicateSet3 {

    public static void main(String[] args) {
        int arr[] = { 1, 6, 3, 1, 3, 6,6,6 };
        int arr_size = arr.length;

        printDup(arr,arr_size);
    }

    // If array has elemnt from 0 to n-1 with with any of these numbers appearing any number of times.
    // sc - O(1) tc - O(n)
    public static void printDup(int[] arr,int len){

        for(int i=0;i<len;i++){

            int index = arr[i]%len;
           arr[index] = arr[index] + len;
        }

        for(int i=0;i<len;i++){

            if (arr[i]>=len*2)
            System.out.println(i+", ");
        }
    }
}
