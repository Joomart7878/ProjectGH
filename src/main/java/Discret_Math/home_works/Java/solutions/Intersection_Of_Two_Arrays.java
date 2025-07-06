package Discret_Math.home_works.Java.solutions;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Arrays {
    public int[] intersectionOfArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        int set_size  = set.size();
        int[] answer = new int[set_size];
        int index = 0;
        for (Integer x : set) {
            answer[index] = x;
            index++;
        }
        return answer;
    }
}
