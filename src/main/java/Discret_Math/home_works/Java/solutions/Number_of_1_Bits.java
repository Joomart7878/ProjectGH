package Discret_Math.home_works.Java.solutions;

public class Number_of_1_Bits {
    public int Bits(int n) {
        int one = 1 << 0;
        int two = 1 << 1;
        int four = 1 << 2;

        int answer = 0;

        for (int i = 0; i <= 30; i++) {
            int bitmask = 1 << i;
            if ((n & bitmask) > 0) {
                answer++;
            }
        }
        return answer;
    }
}