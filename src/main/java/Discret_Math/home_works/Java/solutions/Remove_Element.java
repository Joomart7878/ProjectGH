package Discret_Math.home_works.Java.solutions;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != val) {
                //Gather values that are not equal to 'val'
                //at the beginning of the array. one-by-one.
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
