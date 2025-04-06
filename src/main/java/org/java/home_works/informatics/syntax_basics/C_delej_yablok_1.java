package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class C_delej_yablok_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = (b - (b % a)) / a;  // shows how many pc get each student

        System.out.println(c);
    }
}
