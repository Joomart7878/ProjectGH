package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class D_delej_yablok_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = b % a;  // shows how many pc get each student

        System.out.println(c);
    }
}
