package org.java.home_works.informatics.conditional_operators;

import java.util.Scanner;

public class H_slon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aCol = sc.nextInt();
        int bCol = sc.nextInt();
        int aRow = sc.nextInt();
        int bRow = sc.nextInt();

        int diffCol = Math.abs(aCol - bCol);
        int diffRow = Math.abs(aRow - bRow);
        if (diffRow == diffCol) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
