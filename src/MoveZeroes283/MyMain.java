package MoveZeroes283;

public class MyMain {

    public static void main(String[] args) {
        MyMain main = new MyMain();
        int[] ints = {0,1,0,3,12};
        main.moveZeroes(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public void moveZeroes(int[] nums) {
        int tempI = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[tempI] = i;
                tempI++;
            }
        }
        while (tempI < nums.length) {
            nums[tempI] = 0;
            tempI++;
        }
    }
}
