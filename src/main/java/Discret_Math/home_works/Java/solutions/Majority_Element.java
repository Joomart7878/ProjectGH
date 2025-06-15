package Discret_Math.home_works.Java.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return Integer.MIN_VALUE;
    }

//    public int majorElemento(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
//    }
}
