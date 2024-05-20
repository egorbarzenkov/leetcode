package LongestIncreasingSubsequence300;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(4 == myMain.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
//        System.out.println(3 == myMain.lengthOfLIS(new int[]{4,10,4,3,8,9}));
//        System.out.println(4 == myMain.lengthOfLIS(new int[]{0,1,0,3,2,3}));
//        System.out.println(2 == myMain.lengthOfLIS(new int[]{-2,-1}));
//        System.out.println(6 == myMain.lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6}));
        System.out.println(3 == myMain.lengthOfLIS(new int[]{10,9,2,5,3,4}));

    }

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxResult = 1;

        for (int i = 1; i < nums.length; i++) {
            int maxVal = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]){
                    maxVal = Math.max(maxVal, dp[j]);
                }
            }
            dp[i] = maxVal + 1;
            maxResult = Math.max(maxResult, dp[i]);
        }
        return maxResult;
    }
//    public int lengthOfLIS(int[] nums) {
//        if (nums.length == 1) {
//            return 1;
//        }
//        int res = 0;
//        for (int i = 0; i < nums.length; i++) {
//            res = Math.max(res, recursiveCompair(nums[i], Integer.MIN_VALUE, Arrays.copyOfRange(nums, i + 1, nums.length)));
//        }
//        System.out.println(res);
//        return res;
//    }

    private int recursiveCompair(int i, int prevMax, int[] ints) {
        if (ints.length == 0) {
            return 1;
        } else if (i < ints[0]) {
            if (prevMax > ints[0]) {
                int res = Integer.MIN_VALUE;
                for (int j = 0; j < ints.length; j++) {
                    res = Math.max(res, recursiveCompair(i, Integer.MIN_VALUE, Arrays.copyOfRange(ints, 1, ints.length)));
                }
                return res;
            } else {
                return 1 + recursiveCompair(i, ints[0], Arrays.copyOfRange(ints, 1, ints.length));
            }
        } else {
            return recursiveCompair(i, prevMax, Arrays.copyOfRange(ints, 1, ints.length));
        }
    }
}
