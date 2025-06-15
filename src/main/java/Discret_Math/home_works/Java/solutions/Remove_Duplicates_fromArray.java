package Discret_Math.home_works.Java.solutions;

public class Remove_Duplicates_fromArray {
    public int removeDuplicates(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            nums[j++] = nums[i];
        }
        return j;
    }
}
