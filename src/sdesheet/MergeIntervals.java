package sdesheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = { {1,3}, {9,10}, {2,6}, {15,18} };
        merge(intervals);
    }

    public static int[][] merge(int[][] intervals){

        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0 || intervals==null)
            return res.toArray(new int[0][]);

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][0];

        for (int[] i : intervals){
            if (i[0] <= end)
                end = Math.max(end,i[1]);
            else{
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" arr[" + i + "][" + j + "] = "
                        + intervals[i][j]);
            }
            System.out.println();
        }
        return res.toArray(new int[0][]);
    }
}
