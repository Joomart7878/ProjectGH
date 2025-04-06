package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class F_last_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int lastNumber = a % 10;

        System.out.println(lastNumber);
    }
}
