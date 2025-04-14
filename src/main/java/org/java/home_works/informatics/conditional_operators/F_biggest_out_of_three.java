package org.java.home_works.informatics.conditional_operators;

import java.util.Scanner;

public class F_biggest_out_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        } else {
            System.out.println("Type again");
        }
    }

}
