package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestUsingHeap {

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,8,9};
        int k = 3;
        System.out.println( "result = "+  solve(arr,k));
    }

    public static int solve(int[] arr,int k){

        PriorityQueue<Integer> maxHeap =  new PriorityQueue<Integer>(Collections.reverseOrder());


        for(int i=0;i<arr.length;i++){
            maxHeap.add(arr[i]);

            if(maxHeap.size()>k){
                maxHeap.remove();
            }
        }
        return maxHeap.peek();
    }
}
