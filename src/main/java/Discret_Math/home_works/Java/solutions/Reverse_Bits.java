package Discret_Math.home_works.Java.solutions;

public class Reverse_Bits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i <= 31; i++) {
            int bit = (n >> i) & 1;
            if (bit == 1) {
                result |= 1 << (3 - i);
            }
        }
        return result;
    }
}
