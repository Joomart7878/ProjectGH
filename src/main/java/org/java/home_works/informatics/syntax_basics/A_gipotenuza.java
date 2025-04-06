package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class A_gipotenuza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = (a * a) + (b * b);

        System.out.println(Math.sqrt(c));
    }
}
