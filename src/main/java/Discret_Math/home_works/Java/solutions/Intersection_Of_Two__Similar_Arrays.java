package Discret_Math.home_works.Java.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection_Of_Two__Similar_Arrays {
    public int[] intersectionOfSimilarArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(nums1[i] == nums2[j]) {
                    ans.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] answer = new int[ans.size()];
        int index = 0;
        for (Integer x : ans) {
            answer[index] = x;
            index++;
        }
        return answer;
    }
}
