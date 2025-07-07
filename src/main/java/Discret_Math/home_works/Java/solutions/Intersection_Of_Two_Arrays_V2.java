package Discret_Math.home_works.Java.solutions;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Arrays_V2 {
    public int[] intesectionV2(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < m; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] answer = new int[set2.size()];

        int index = 0;
        for (Integer x : answer) {
            answer[index] = x;
            index++;
        }
        return answer;
    }
}