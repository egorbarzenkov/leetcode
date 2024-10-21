package IntersectionTwoArraysII350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(Arrays.toString(myMain.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ints = new int[1001];
        for (int num : nums1) {
            ints[num] = ints[num] + 1;
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (ints[num] > 0) {
                list.add(num);
                ints[num] = ints[num] - 1;
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
