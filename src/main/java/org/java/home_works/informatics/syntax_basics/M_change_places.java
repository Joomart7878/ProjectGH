package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class M_change_places {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);



    }
}
