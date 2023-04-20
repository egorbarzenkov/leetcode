package MajorityElementII229;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) {

    }
    public List<Integer> majorityElement(int[] nums) {
        return Arrays.stream(nums).boxed() .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().filter(integerLongEntry -> integerLongEntry.getValue() > nums.length/3)
                .map(integerLongEntry -> integerLongEntry.getKey()).collect(Collectors.toList());

    }
}
