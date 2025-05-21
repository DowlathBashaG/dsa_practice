package dowlath.io.dsa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{4,5}}; // output {1,5}
        int[][] result  =  mergeIntervals(intervals);
        System.out.println("Merge Intervals .... : " + Arrays.deepToString(result));
    }
    private static int[][] mergeIntervals(int[][] in) {
        if (in == null || in.length < 1) {
            return in;
        }
        Arrays.sort(in, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> m = new ArrayList<>();
        int[] c = in[0];

        for (int i = 0; i < in.length; i++) {
            if (in[i][0] <= c[1]) {
                c[1] = Math.max(c[1], in[i][1]);
            } else {
                m.add(c);
                c = in[i];
            }
        }
        m.add(c);
        return m.toArray(new int[m.size()][]);
    }
}
