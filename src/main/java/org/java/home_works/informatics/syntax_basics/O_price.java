package org.java.home_works.informatics.syntax_basics;

import java.util.Scanner;

public class O_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int totalKopecks = (a * 100 + b) * n;
        int totalRubles = totalKopecks / 100;
        int remainingKopecks = totalKopecks % 100;

        System.out.println(totalRubles + " " + remainingKopecks);

    }
}
