package MergeIntervals56;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(Arrays.deepToString(myMain.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
//        System.out.println(Arrays.deepToString(myMain.merge(new int[][]{{1, 4}, {4, 5}})));
//        System.out.println(Arrays.deepToString(myMain.merge(new int[][]{{1, 4}, {2, 3}})));
//        System.out.println(Arrays.deepToString(myMain.merge(new int[][]{{1, 3}, {2,6}, {8,10}, {15,18}})));
        System.out.println(Arrays.deepToString(myMain.merge(new int[][]{{1,4}, {0,0}})));
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            else {
                merged.getLast()[1] = Math.max(
                        merged.getLast()[1],
                        interval[1]
                );
            }
        }
        System.gc();
        return merged.toArray(new int[merged.size()][]);
    }
}
