package ContainerWithMostWater11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) throws IOException {
        MyMain main = new MyMain();
        List<Integer> list = Arrays.stream(Files.readAllLines(Paths.get("src/ContainerWithMostWater11/test.txt")).get(0).split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        int[] ints =new int[list.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = list.get(i);
        }
        long start = System.currentTimeMillis();
        System.out.println(main.maxArea(ints));
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        start = System.currentTimeMillis();
        System.out.println(main.maxArea2(ints));
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                if (max < (j - i) * Math.min(height[i], height[j])) {
                    max = (j - i) * Math.min(height[i], height[j]);
                }
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if (height[left] < height[right]) left++;
            else if (height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }

}
