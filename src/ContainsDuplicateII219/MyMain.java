package ContainsDuplicateII219;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        System.out.println(main.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
//        System.out.println(main.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        System.out.println(main.containsNearbyDuplicate(new int[]{1,2,3,1,2,3,3}, 2));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Create a hashmap to store value of nums with their index.
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            // If nums[i] not present put it normally.
            if(map.get(nums[i]) == null)
                map.put(nums[i],i);
            else{
                //If already present get the value first
                Integer in = map.get(nums[i]);
                //Check out condition after getting the value
                //If satisfied return true here.
                if(Math.abs(in-i) <= k) return true;
                //If above statement return false it means we have
                // larger value than k, we need to update the value till now.
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
