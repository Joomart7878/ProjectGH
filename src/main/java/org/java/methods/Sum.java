package org.java.methods;

public class Sum {
    public static int sum(int a, int b) {
        System.out.println("Using int");
        return a + b;
    }

    public static double sum(double a, double b){
        System.out.println("Using double");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5.4,3.3));
        System.out.println(sum(6,3));
        System.out.println(sum(5.5, 5.55));
        System.out.println(sum(7,6.5));
    }
}
