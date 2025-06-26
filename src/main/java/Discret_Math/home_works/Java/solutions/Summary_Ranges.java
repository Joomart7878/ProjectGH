package Discret_Math.home_works.Java.solutions;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();

        int range_start = nums[0];
        int range_end = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (range_start == range_end) {
                    answer.add(Integer.toString(range_start));
                } else {
                    answer.add(Integer.toString(range_start) + "->" + Integer.toString(range_end));
                }
                range_start = nums[i];
            }
        }
        range_end = nums[nums.length - 1];
        if (range_start == range_end) {
            answer.add(Integer.toString(range_start));
        } else {
            answer.add(Integer.toString(range_start) + "->" + Integer.toString(range_end));
        }
        return answer;
    }
}
