package Discret_Math.home_works.Java.solutions;

public class Move_Zeros {
    public int moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int insertPosition = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[insertPosition++] = num;
            }
        }
        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
        return insertPosition;
    }

    public static void main(String[] args) {
        Move_Zeros nums = new Move_Zeros();

        int[] zores = {0, 1, 0, 3, 12};

        int result = nums.moveZeroes(zores);

        System.out.println(result);
    }
}
