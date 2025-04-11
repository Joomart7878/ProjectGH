package org.java.home_works.informatics.conditional_operators;

import java.util.Scanner;

public class D_number_sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("1");
        } else if (a < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

    }
}
