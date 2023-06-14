package BinarySearch704;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(main.search(new int[]{-1,0,3,5,9,12}, 2));
        System.out.println(main.search(new int[]{2,5}, 5));
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
