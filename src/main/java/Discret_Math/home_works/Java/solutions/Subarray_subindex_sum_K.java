package Discret_Math.home_works.Java.solutions;

import java.util.HashMap;

public class Subarray_subindex_sum_K {
    public int subIndexSum(int[] nums, int k){
        int n = nums.length;
        int ans = 0;

        int[] pref = new int[n];
        for (int i = 0; i < n; i++) {
            if (0 < i) {
                pref[i] = pref[i - 1];
            }
            pref[i] += nums[i];
        }
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        hs.put(0, 1);

        for (int right = 0; right < n; right++) {
            ans += hs.getOrDefault(pref[right] - k,0);
            hs.put(pref[right], hs.getOrDefault(pref[right], 0) + 1);
        }
        return ans;
    }
}
