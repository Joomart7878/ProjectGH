package org.java.home_works.informatics.leetcode;

public class BigAdd {

    public static String reverse(String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; --i) {
            sb.append(a.charAt(i));
        }
        return sb.toString();

    }
    public String add(String a, String b) {
        // a = "123";
        // b = "99";

        a = reverse(a);
        b = reverse(b);
        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < Math.min(a.length(), b.length()); ++i) {
            int aNumber = a.charAt(i) - '0';
            int bNumber = b.charAt(i) - '0';
            int sum = aNumber + bNumber + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "1234567890 ABCDEF abcdefg";
        for (int i = 0; i < s.length(); ++i) {
            int a = s.charAt(i);
            System.out.printf("%c %d\n", s.charAt(i), a);
        }

    }
}
