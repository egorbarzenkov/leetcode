package SingleNumber136;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.singleNumber(new int[]{2,2,1}));
        System.out.println(main.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(main.singleNumber(new int[]{1}));
    }
    public int singleNumber(int[] nums) {
        int n=0;
        for(int i: nums)
            n ^=i;
        return n;
    }
//    public int singleNumber(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        } else {
//            int res = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i]==0) {
//                    continue;
//                } else {
//                    boolean findDouble = false;
//                    for (int j = i+1; j <nums.length; j++) {
//                        if (nums[j] != 0 && nums[i] == nums[j]) {
//                            findDouble = true;
//                            nums[i] = 0;
//                            nums[j] = 0;
//                            break;
//                        }
//                    }
//                    if (!findDouble) {
//                        res = nums[i];
//                    }
//                }
//            }
//            return res;
//        }
//    }
}
