package Heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MinHeapUsingPQueue {

    public static void main(String[] args) {

        PriorityQueue pQueue = new PriorityQueue();

        pQueue.add(7);
        pQueue.add(4);
        pQueue.add(6);
        pQueue.add(3);
        pQueue.add(9);
        pQueue.add(1);

        // Printing all elements
        System.out.println("The queue elements:");

        Iterator itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("-------------------");
        System.out.println(pQueue.peek());

        // Getting objects from the queue using toArray()
        // in an array and print the array
        Object[] arr = pQueue.toArray();
        System.out.println("Value in array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.println("Value: " + arr[i].toString());
    }
}
