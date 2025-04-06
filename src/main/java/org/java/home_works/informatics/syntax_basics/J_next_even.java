package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class J_next_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = ((a / 2 + 1) * 2);

        System.out.println(b);

    }
}
