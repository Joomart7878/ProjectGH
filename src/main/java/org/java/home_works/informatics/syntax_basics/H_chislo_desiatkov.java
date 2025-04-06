package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class H_chislo_desiatkov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int tensNumber = (a / 10) % 10;

        System.out.println(tensNumber);

    }
}
