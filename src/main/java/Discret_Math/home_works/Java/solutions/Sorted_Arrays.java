package Discret_Math.home_works.Java.solutions;

public class Sorted_Arrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] answer = new int[n+m];
        int p1 = 0;
        int p2 = 0;
        while (p1 < m && p2 < n){
            if (nums1[p1] < nums2[p2]) {
                answer[p1 + p2] = nums1[p1];
                p1++;
            } else {
                answer[p1 + p2] = nums2[p2];
                p2++;
            }while (p1 < m) {
                answer[p1 + p2] = nums1[p1];
            }
            while (p2 < n) {
                answer[p1 + p2] = nums2[p2];
            }
            for (int i = 0; i < n + m; i++) {
                nums1[i] = answer[i];
            }
        }

    }
}
