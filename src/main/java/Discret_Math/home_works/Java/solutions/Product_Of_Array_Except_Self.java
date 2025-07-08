package Discret_Math.home_works.Java.solutions;

public class Product_Of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix_mul = new int[n];

        prefix_mul[0] = nums[0];
        for (int i = 1; i < n; i++){
            prefix_mul[i] = prefix_mul[i - 1] * nums[i];
        }

        int[] suffix_mul = new int[n];

        suffix_mul[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix_mul[i] = suffix_mul[i + 1] * nums[i];
        }

        int[] answer = new int[n];
        answer[0] = suffix_mul[1];
        answer[n - 1] = prefix_mul[n - 2];
        for (int i = 1; i < n - 1; i++) {
            answer[i] = prefix_mul[i - 1] * suffix_mul[i + 1];
        }
        
        return answer;
    }

}
