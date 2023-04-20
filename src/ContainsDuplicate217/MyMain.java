package ContainsDuplicate217;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(main.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(main.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        Set<Integer> integerSet = new HashSet<>();
        for (int i :
                nums) {
            if (integerSet.contains(i)) return true;
            integerSet.add(i);
        }
        return false;
    }
}
