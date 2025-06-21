package Discret_Math.home_works.Java.solutions;

public class Add_Binary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        if (carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
