package RemoveDuplicatesFromSortedArray26;

public class SolutionMain {

    public static void main(String[] args) {

        SolutionMain main = new SolutionMain();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(main.removeDuplicates(nums));
//        int[] nums2 = {1, 1, 2};
//        System.out.println(main.removeDuplicates(nums2));
//        int[] nums3 = {1};
//        System.out.println(main.removeDuplicates(nums3));
//        int[] nums4 = {1, 1, 1};
//        System.out.println(main.removeDuplicates(nums4));
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int addIndex = 1;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]){
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        return addIndex;
    }
}
