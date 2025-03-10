package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {


        public static int[][] merge(int[][] intervals) {
            // Edge case: Check if the input is null or empty
            if (intervals == null || intervals.length == 0) {
                return new int[0][];
            }

            // Sort intervals by their start values
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            List<int[]> res = new ArrayList<>();

            // Initialize the first interval as the current "merged" interval
            int start = intervals[0][0];
            int end = intervals[0][1];

            // Iterate through each interval in the sorted array
            for (int[] interval : intervals) {
                if (interval[0] <= end) {
                    // If the current interval overlaps with the merged interval, extend the merged interval
                    end = Math.max(end, interval[1]);
                } else {
                    // If there is no overlap, add the current merged interval to the result
                    res.add(new int[]{start, end});
                    // Start a new interval
                    start = interval[0];
                    end = interval[1];
                }
            }

            // Add the last merged interval to the result
            res.add(new int[]{start, end});


            // Convert the result list to a 2D array and return
            return res.toArray(new int[res.size()][]);
        }


    public static void main(String[] args) {
        // Example input
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        // Merge intervals
        int[][] mergedIntervals = merge(intervals);

        // Print the result
        System.out.println("Merged intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
