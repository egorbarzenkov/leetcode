package RemoveElement27;

public class MyMain {

    public int removeElement(int[] nums, int val) {
        int returnInt = 0;
        for (int i : nums) {
            if (i != val) {
                nums[returnInt] = i;
                returnInt ++;
            }
        }
        return returnInt;
    }
}
