package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class L_electronnye_chasy_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int hours = (a / 3600) % 24;
        int minutes = (a % 3600) / 60;
        int seconds = a % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
