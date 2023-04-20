package PlusOne66;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        int[] nums = {1, 2, 3};
//        Arrays.stream(main.plusOne(nums)).forEach(System.out::println);
//        int[] nums2 = {4,3,2,1};
//        Arrays.stream(main.plusOne(nums2)).forEach(System.out::println);
        int[] nums3 = {9,8,9};
        Arrays.stream(main.plusOne(nums3)).forEach(System.out::println);
//        int[] nums4 = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
//        Arrays.stream(main.plusOne(nums4)).forEach(System.out::print);
    }

    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] != 9) {
            digits[digits.length-1] = digits[digits.length-1] +1;
            return digits;
        } else {
            boolean containsNotNine = false;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] = digits[i] + 1;
                    containsNotNine = true;
                    break;
                }
            }
            if (!containsNotNine) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
        }
        return digits;
    }
//wrong version
    //        long l = 0;
//        int degree = 0;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            l += (long) digits[i] * Math.pow(10, degree);
//            degree++;
//        }
//        l++;
//        int length = String.valueOf(l).length() - 1;
//        int[] result = new int[length + 1];
//        for (int i = 0; i <= length; i++) {
//            long y = (long) Math.pow(10, length - i);
//            long x = (l / y);
//            result[i] = (int) x;
//            l = l - (x * y);
//        }
//        return result;
}
