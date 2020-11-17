package Heap;

public class MinHeapUsingArray {

    public static void main(String[] args) {

        int[] arr = new int[]{21, 11, 5, 19, 18, 14, 9};

        int[] heap = new int[arr.length];
        heap = buildHeap(arr);

        for(int i=0;i<heap.length;i++){
                System.out.println(heap[i]+", ");
        }
    }

    public static  int[] buildHeap(int[] arr){

        int[] minHeap = new int[arr.length];
        int minHeapIndex = 0;

        for(int i=0;i<arr.length;i++){

            if(minHeap.length==0) {
                minHeap[0] = arr[i];
                minHeapIndex++;
            }

            else{
                minHeap[minHeapIndex] = arr[i];
                int parentIndex = getParentIndex(minHeapIndex);

                int current = minHeapIndex;

                while (minHeap[parentIndex]>minHeap[current]){

                    int temp = minHeap[parentIndex];
                    minHeap[parentIndex] = minHeap[current];
                    minHeap[current] = temp;

                    current = parentIndex;

                    // calculate parent again
                    parentIndex = getParentIndex(current);
                }
                minHeapIndex++;
            }

        }
        return minHeap;
    }

    public static int getParentIndex(int leafIndex){

        int parentIndex = (leafIndex-1) / 2 ;
        return parentIndex;
    }

    public static int getLeftChildIndex(int rootIndex){

        int leftIndex = 0;
        leftIndex = rootIndex * 2 + 1;

        return leftIndex;
    }

    public static int getRightChildIndex(int rootIndex){

        int rightIndex = 0;
        rightIndex = rootIndex * 2 + 2;

        return rightIndex;
    }
}
