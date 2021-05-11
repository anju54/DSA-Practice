package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapUsingPQueue {

    public static void main(String[] args) {

        // Creating empty priority queue
        PriorityQueue<Integer> pQueue =
                new PriorityQueue<Integer>(Collections.reverseOrder());

        pQueue.add(10);
        pQueue.add(30);
        pQueue.add(20);
        pQueue.add(400);

        System.out.println(pQueue);

        System.out.println("Head value using peek function:" +
                pQueue.peek());

    }


}
