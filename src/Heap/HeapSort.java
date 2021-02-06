package Heap;

public class HeapSort {

    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        HeapSort hs = new HeapSort();
        hs.doHeapSort(arr,n);

        printArray(arr,n);
    }

    public void heapify(int[] arr,int n,int i){

        int left = 2 * i +1;
        int right = 2 * i +2;

        int largest = i;

        // If left child is larger than root
        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }

        if(largest!=i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr,n,largest);
        }

    }

    public void doHeapSort(int[] arr,int n){

        // build the heap
        for (int i= n/2 -1; i>=0; i--){
            heapify(arr,n,i);
        }

        // extract element one by one
        for(int j=n-1; j>0;j--){
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;

            heapify(arr,j,0);
        }
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
