package SummaryRanges228;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        main.summaryRanges(new int[]{0,1,2,4,5,7}).forEach(System.out::println);
        main.summaryRanges(new int[]{0,2,3,4,6,8,9}).forEach(System.out::println);
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> listRes = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return listRes;
        }
        int currentRange = nums[0];
        int firstRange = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentRange + 1 != nums[i]) {
                if (currentRange == firstRange) {
                    listRes.add(String.valueOf(currentRange));
                } else {
                    listRes.add(String.format("%d->%d", firstRange, currentRange));
                }
                currentRange = nums[i];
                firstRange = nums[i];
            } else {
                currentRange = nums[i];
            }
        }
        if (currentRange == firstRange) {
            listRes.add(String.valueOf(currentRange));
        } else {
            listRes.add(String.format("%d->%d", firstRange, currentRange));
        }
        System.gc();
        return listRes;
    }
}
