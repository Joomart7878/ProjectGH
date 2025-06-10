package org.java.home_works.informatics.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        int x = 123;
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            int lastDigit = x % 10;
            sb.append(lastDigit);
            x = x / 10;
        }
        String reversed = sb.toString();
        String result = sb.reverse().toString();
        System.out.println(reversed);
        System.out.println(result);

    }
}
