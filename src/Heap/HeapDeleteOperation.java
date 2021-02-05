package Heap;

public class HeapDeleteOperation {

    public static void main(String[] args) {

        int arr[] = { 10, 5, 3, 2, 4 };

        int n = arr.length;

        n = delete(arr,n);

        printArray(arr, n);
    }

    static int delete(int[] arr,int n){

        int bottom = arr[n-1];

        arr[0] = bottom;

        // decrease the size
        n = n - 1;

        heapify(arr,n,0);

        return n;
    }

    static void heapify(int[] arr,int n,int i){

        int left = 2 * i +1;
        int right = 2 * i +2;

        int largest = i;

        // If left child is larger than root
        if(i<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(i<n && arr[right]>arr[largest]){
            largest = right;
        }

        if(largest!=i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr,n,largest);
        }

    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
