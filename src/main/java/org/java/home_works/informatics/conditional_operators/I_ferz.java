package org.java.home_works.informatics.conditional_operators;

import java.util.Scanner;

public class I_ferz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int itemX = c; // Item's X
        int itemY = d; // Item's Y

        System.out.println("Queen's move from (" + a + ", " + b + ") to (" + c + ", " + d + ")");
        System.out.println("Item is at (" + itemX + ", " + itemY + ")");

        // 1. Validate coordinates
        if ((a < 1 || a > 8) || (b < 1 || b > 8) || (c < 1 || c > 8) || (d < 1 || d > 8) || (itemX < 1 || itemX > 8) || (itemY < 1 || itemY > 8)) {
            System.out.println("Invalid coordinates! All coordinates must be between 1 and 8.");
        } else {
            boolean isValidMove = false;

            // 2. Check if it's a valid queen's move
            if (a == c && b == d) {
                isValidMove = false; // Cannot stay in the same place
            } else if (a == c) {
                isValidMove = true; // Horizontal move
            } else if (b == d) {
                isValidMove = true; // Vertical move
            } else if (Math.abs(a - c) == Math.abs(b - d)) {
                isValidMove = true; // Diagonal move
            }

            // 3. Check if the queen captures the item
            if (isValidMove && c == itemX && d == itemY) {
                System.out.println("The queen captures the item!");
            } else {
                System.out.println("The queen does not capture the item with this move.");
                if (!isValidMove) {
                    System.out.println("Reason: The move is not a valid queen's move.");
                } else if (c != itemX || d != itemY) {
                    System.out.println("Reason: The queen does not land on the item's square.");
                }
            }
        }
    }
}
