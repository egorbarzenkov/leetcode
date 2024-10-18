package FindDuplicateNumber287;

import java.util.HashSet;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.findDuplicate(new int[] {1,3,4,2,2}));
    }

    public int findDuplicate(int[] nums) {
        boolean [] bool = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (bool[nums[i]]) {
                return nums[i];
            } else {
                bool[nums[i]] = true;
            }
        }
        return -1;
    }
//    public int findDuplicate(int[] nums) {
//        HashSet set = new HashSet();
//        for (int num: nums) {
//            if (set.contains(num)) {
//                return num;
//            } else {
//                set.add(num);
//            }
//        }
//        return 0;
//    }
}
