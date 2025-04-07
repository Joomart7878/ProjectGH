package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class K_elektronnye_chasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int hours = (a / 60) % 24;
        int minutes = a % 60;


        System.out.println(hours + " " + minutes);
    }
}
