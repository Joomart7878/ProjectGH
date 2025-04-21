package org.java.home_works.informatics.loops;
import java.util.Scanner;

public class B_reminder_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean found = false;
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (found) {
            System.out.println(); // Add a newline at the end if output is not empty
        }
        scanner.close();
    }
}