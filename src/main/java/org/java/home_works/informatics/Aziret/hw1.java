package org.java.home_works.informatics.Aziret;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sqrt = (int) Math.floor(Math.sqrt(n));

        boolean is_prime = true;
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                is_prime = false;
                break;
            }
        }
        System.out.println(is_prime ? "prime" : "composite");
    }
}
