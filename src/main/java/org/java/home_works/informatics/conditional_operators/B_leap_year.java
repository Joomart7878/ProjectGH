package org.java.home_works.informatics.conditional_operators;

import java.util.Scanner;

public class B_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
