//package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class E_mkad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double t = sc.nextDouble();

        int mkadLength = 109;

        double distance = v * t;

        double finalPosition = (distance % mkadLength + mkadLength) % mkadLength;

        System.out.println(finalPosition);

    }
}
