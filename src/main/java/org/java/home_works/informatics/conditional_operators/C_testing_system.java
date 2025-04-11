package org.java.home_works.informatics.conditional_operators;

import java.util.Scanner;

public class C_testing_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1 && b == 1) {
            System.out.println("YES");
        } else if (a != 1 && b != 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
