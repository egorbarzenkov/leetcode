package SearchInsertPosition35;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();

        int[] nums = {1, 3, 5, 6, 9};
        System.out.println(main.searchInsert(nums, 5));
        System.out.println(main.searchInsert(nums, 2));
        System.out.println(main.searchInsert(nums, 7));
        int[] nums2 = {1, 3};
        System.out.println(main.searchInsert(nums2, 1));
    }

    public int searchInsert(int[] nums, int target) {
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        if (nums[0] > target) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (right != left && right - left != 1) {
            int middle = ((right - left) / 2) + left;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > target) {
                right = middle;
            }
            if (nums[middle] < target) {
                left = middle;
            }
        }
        if (nums[left] >= target) {
            return left;
        } else {
            return right;
        }
    }
}
