package org.java.home_works.informatics.arrays;

import java.util.Scanner;

public class O_zuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dividers = 0;
        int prev = -1;

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            if (i == 0) {
                continue;
            }
            if (x != prev) {
                dividers++;
            }
            prev = x;
        }
    }
}
