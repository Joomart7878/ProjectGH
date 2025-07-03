package Discret_Math.home_works.Java.solutions;

public class Partition_Array {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;

        int[] result = new int[n];
        int insertPosition = 0;

        int pivotFreq = 0;

        for (int num : nums) {
            if (num < pivot) {
                result[insertPosition] = num;
                insertPosition++;
            } else if (num == pivot) {
                pivotFreq++;
            }
        }
        while (pivotFreq > 0) {
            result[insertPosition] = pivot;
            insertPosition++;
            pivotFreq--;
        }
        for (int num : nums) {
            if(num > pivot) {
                result[insertPosition] = num;
                insertPosition++;
            }
        }
        return result;
    }
}
