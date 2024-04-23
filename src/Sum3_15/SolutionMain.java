package Sum3_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionMain {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(nums[i]>0){
                break;
            }

            if(i > 0 && nums[i]==nums[i-1])continue;

            int left = i+1;
            int right = n-1;

            while(left < right){
                int  total = nums[i] + nums[left] + nums[right];

                if(total == 0 ){
                    list.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(total < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.gc();
        return list;
    }
}
