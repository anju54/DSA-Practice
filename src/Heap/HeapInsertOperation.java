package Heap;

public class HeapInsertOperation {

    static void add(int[] arr, int n, int key){

      for (int i=0;i<arr.length;i++){
          heapify(arr,n,i);
      }
    }

    public static void heapify(int[] arr,int n,int i){

        int left = 2 * i +1;
        int right = 2 * i +2;

        int largest = i;

        // If left child is larger than root
        if(left<n && arr[left]>arr[largest])
            largest = left;

        if(right<n && arr[right]>arr[largest])
            largest = right;

        if(largest!=i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr,n,largest);
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 3, 2, 4 };

        int n = arr.length;

        add(arr,n,15);

        // max heap
        System.out.println("Max heap ---");
        printArray(arr,n);

        // for min heap change > this with < in heapify
    }
}
