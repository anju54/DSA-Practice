package Heap;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinimumCost {

    static int []minheap = new int[4];

    public static void main(String[] args) {

        int []arr = new int[]{2,4,3};
        int n = arr.length;

        int cost = findMinCostToConnectRopes(arr);
        System.out.println(cost);
    }

    public static int findMinCostToConnectRopes(int []arr){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
        }
        int cost = 0;

        while (minHeap.size() > 1){

            int sum = minHeap.poll() + minHeap.poll();
            cost = cost + sum;
            minHeap.add(sum);
        }
        return cost;
    }


}
