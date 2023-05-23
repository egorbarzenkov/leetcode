package MissingNumber268;

public class MyMain {

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(myMain.missingNumber(new int[]{3, 0, 1}));
//        System.out.println(myMain.missingNumber(new int[]{0, 1}));
        System.out.println(myMain.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - 1 != i) {
                if (nums[i] - 1 < 0) break;
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                return i + 1;
            }
        }
        return 0;
    }
}
