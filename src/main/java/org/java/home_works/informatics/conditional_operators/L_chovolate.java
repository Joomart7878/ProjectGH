package org.java.home_works.informatics.conditional_operators;

import java.util.Scanner;

public class L_chovolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        boolean canBreakHorizontally = (k % m == 0) && (k / m > 0) && (k / m < n);
        boolean canBreakVertically = (k % n == 0) && (k / n > 0) && (k / n < m);

        if (canBreakHorizontally || canBreakVertically) { // If EITHER is true
            System.out.println("YES");
        } else { // If NEITHER is true
            System.out.println("NO");
        }

    }
}
