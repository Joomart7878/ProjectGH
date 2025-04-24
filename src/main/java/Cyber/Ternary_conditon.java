package Cyber;

public class Ternary_conditon {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 10;
        int max;

        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }

        max = (n1 > n2) ? n1 : n2;
        System.out.println(max);

        String action;
        boolean isGreen = false;

        action = (isGreen) ? "Can Drive" : "Cannot Drive";
        System.out.println(action);

        int bill = 2000;
        int discount = (bill >= 2000) ? 15 : 10;
        System.out.println(discount);
    }
}
