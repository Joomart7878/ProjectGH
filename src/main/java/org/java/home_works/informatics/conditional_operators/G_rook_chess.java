package org.java.home_works.informatics.conditional_operators;

import java.util.Scanner;

public class G_rook_chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rookRow = sc.nextInt();
        int rookCol = sc.nextInt();
        int pieceRow = sc.nextInt();
        int pieceCol = sc.nextInt();

        if (rookCol == pieceCol || rookRow == pieceRow) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
