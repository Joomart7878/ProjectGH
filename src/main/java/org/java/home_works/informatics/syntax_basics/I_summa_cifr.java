//package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class I_summa_cifr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int digit1 = a / 100;
        int remainder = a % 100;
        int digit2 = remainder / 10;
        int digit3 = remainder % 10;

        System.out.println(digit1 + digit2 + digit3);
    }
}
