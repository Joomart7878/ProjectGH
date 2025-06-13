package Discret_Math.home_works.Java.solutions;

public class Revers_String {
    public String reverseString(char[] s) {
        char[] t = new StringBuilder(new String(s)).reverse().toString().toCharArray();
        System.arraycopy(t, 0, s, 0, s.length);
        return null;
    }
}
