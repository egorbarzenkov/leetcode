package SlidingWindowMedian480;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class MyMain {//todo https://leetcode.com/problems/sliding-window-median/description/
    public static void main(String[] args) throws IOException {
        MyMain myMain = new MyMain();
//        System.out.println(Arrays.toString(myMain.medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
//        int[] list = Arrays.stream(Files.readAllLines(Paths.get("src/SlidingWindowMedian480/test.txt")).get(0).split(",")).map(Integer::parseInt).toArray(value -> value);
//        System.out.println(Arrays.toString(myMain.medianSlidingWindow(list, 50000)));

    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] doubles = new double[nums.length - (k - 1)];
        List<Integer> numArray = new LinkedList<>();
        for (int j = 0; j < k; j++) {
            numArray.add(nums[j]);
        }
        int i = 0;
        Collections.sort(numArray);
        while (i + k <= nums.length) {
            numArray.remove(nums[i]);
            numArray.add(nums[i+k]);
            double median;
            if (numArray.size() % 2 == 0)
                median = ((double) numArray.get(numArray.size() / 2) + (double) numArray.get(numArray.size() / 2 - 1)) / 2;
            else
                median = numArray.get(numArray.size() / 2);
            doubles[i] = median;
            i++;
        }
        return doubles;
    }
}
