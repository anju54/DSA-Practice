package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class KsortedArray {

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,8,9};
        int k = 2;
        System.out.println( "result = "+  solve(arr,k));
    }

    public static ArrayList<Integer> solve(int[] arr,int k){

        ArrayList<Integer> res = new ArrayList<>();

        PriorityQueue<Integer> maxHeap =  new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){

            maxHeap.add(arr[i]);
            if(maxHeap.size()>k){

                res.add(maxHeap.poll());
            }
        }

        while (maxHeap.size()!=0){
            res.add(maxHeap.poll());
        }

//        Iterator itr = maxHeap.iterator();
//        while (itr.hasNext())
//            System.out.println(itr.next());

        return res;
    }
}

