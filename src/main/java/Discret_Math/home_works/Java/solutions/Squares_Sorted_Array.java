package Discret_Math.home_works.Java.solutions;

public class Squares_Sorted_Array {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int insertPosition = n - 1; insertPosition >= 0; insertPosition--) {
            if (Math.abs(A[left]) > Math.abs(A[right])) {
                result[insertPosition] = A[left] * A[right];
                left++;
            } else {
                result[insertPosition] = A[right] * A[right];
                right--;
            }
        }
        return result;
    }
}
