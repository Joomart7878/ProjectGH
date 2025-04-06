package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class B_sled_predydushee {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a + 1;
        int c = a - 1;

        System.out.println("The next number for the number " + a + " is " + b + ".");
        System.out.println("The previous number for the number " + a + " is " + c + ".");
    }
}
