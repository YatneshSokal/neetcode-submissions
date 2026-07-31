public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort intervals based on ending time (greedy choice: earliest finish first)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        // res will count how many intervals we remove
        int res = 0;

        // prevEnd stores the end time of the last non-overlapping interval
        int prevEnd = intervals[0][1]; // take first interval's end after sorting

        // Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            // intervals[i][0] → start time of current interval
            int start = intervals[i][0];

            // intervals[i][1] → end time of current interval
            int end = intervals[i][1];

            // If current interval starts before previous ends → overlap
            if (start < prevEnd) {

                // remove this interval (increase count)
                res++;

            } else {

                // no overlap → keep this interval
                // update prevEnd to current interval's end
                prevEnd = end;
            }
        }

        // return total number of removed intervals
        return res;
    }
}
