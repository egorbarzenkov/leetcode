package MinimumTotalDistanceTraveled2463;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(myMain.minimumTotalDistance(Arrays.asList(0,4,6), new int[][]{{2,2}, {6,2}}));
        System.out.println(myMain.minimumTotalDistance(Arrays.asList(9,11,99,101), new int[][]{{10,1}, {7,1}, {14,1}, {100,1}, {96,1}, {103,1}}));
    }
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        robot.sort(Integer::compareTo);
        long[] allCase = new long[robot.size()];
        for (int k = 0; k < allCase.length; k++) {
            int[][] copyFactory = new int[factory.length][];
            for (int i = 0; i < factory.length; i++) {
                copyFactory[i] = factory[i].clone();
            }
            long res = 0;
            for (int i = k; i < robot.size(); i++) {
                int minimumSuze = Integer.MAX_VALUE;
                int indexFactory = 0;
                for (int j = 0; j < copyFactory.length; j++) {
                    if (Math.abs(robot.get(i) - copyFactory[j][0]) < minimumSuze && copyFactory[j][1] > 0) {
                        minimumSuze = Math.abs(robot.get(i) - copyFactory[j][0]);
                        indexFactory = j;
                    }
                }
                copyFactory[indexFactory][1]--;
                res += minimumSuze;
            }
            for (int i = 0; i < k; i++) {
                int minimumSuze = Integer.MAX_VALUE;
                int indexFactory = 0;
                for (int j = 0; j < copyFactory.length; j++) {
                    if (Math.abs(robot.get(i) - copyFactory[j][0]) < minimumSuze && copyFactory[j][1] > 0) {
                        minimumSuze = Math.abs(robot.get(i) - copyFactory[j][0]);
                        indexFactory = j;
                    }
                }
                copyFactory[indexFactory][1]--;
                res += minimumSuze;
            }
            allCase[k] = res;
        }
        Arrays.sort(allCase);
        return allCase[0];
    }
}
