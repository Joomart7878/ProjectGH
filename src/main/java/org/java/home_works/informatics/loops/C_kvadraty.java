package org.java.home_works.informatics.loops;

import java.util.Scanner;

public class C_kvadraty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean found = false;
        for (int i = a; i <= b; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (found) {
            System.out.println(); // Add a newline at the end if any perfect squares were found
        }

        sc.close();
    }
}
