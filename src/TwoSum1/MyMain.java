package TwoSum1;

import java.util.Arrays;
import java.util.HashMap;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(Arrays.toString(myMain.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(myMain.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(myMain.twoSum(new int[]{3, 3}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
