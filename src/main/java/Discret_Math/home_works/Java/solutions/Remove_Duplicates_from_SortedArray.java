package Discret_Math.home_works.Java.solutions;

public class Remove_Duplicates_from_SortedArray {
    public int removeDuplicates(int[] nums) {
        int insertPosition = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[insertPosition - 2]) {
                nums[insertPosition++] = nums[i];
            }
        }
        return insertPosition;
    }
}
