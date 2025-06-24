package Discret_Math.home_works.Java.solutions;

public class Remove_Duplicates_Version2 {
    public int removeDuplicates(int[] nums) {
        int[] nums_copy = new int[nums.length];
        int num_unique_elements = nums.length;
        nums_copy[0] = nums[0];
        int pointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                num_unique_elements--;
            } else {
                nums_copy[pointer] = nums[i];
                pointer++;
            }
        }
        for (int i = 0; i < pointer; i++) {
            nums[i] = nums_copy[i];
        }
        return num_unique_elements;
    }
}
