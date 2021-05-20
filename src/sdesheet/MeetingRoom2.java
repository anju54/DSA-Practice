package sdesheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// https://leetcode.com/problems/meeting-rooms/

/**
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi],
 * return the minimum number of conference rooms required.
 */
public class MeetingRoom2 {

    public static void main(String[] args) {

        int[][] arr = new int[][]{ {9,10},{4,9},{4,17} };
        int ans = minMeetingRooms(arr);
        System.out.println(ans);
    }


    // using min heap
    public static int minMeetingRooms(int[][] intervals) {

       if (intervals.length <= 1)
           return intervals.length;

        // sort the interval by start time
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        // min pq to store interval, compared by endtime
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[1]-b[1]));
        for(int[] interval: intervals){
            // if top mgt in pq ends before current mgt starts
            if(!pq.isEmpty() && pq.peek()[1]<=interval[0]){
                // empty the room, which is remove the top mgt from pq
                pq.remove();
            }
            pq.add(interval);
        }

       return pq.size();
    }

}
