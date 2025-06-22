package Discret_Math.home_works.Java.solutions;

public class Sort_Colors {
    public void sortColors(int[] nums) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 1) swap(nums, i, pos++);
        }
        for (int i = pos; i < nums.length; i++) {
            if (nums[i] == 1) swap(nums, i, pos++);
        }
    }

    private void swap(int[] nums, int i, int j){

    }
}
