package org.java.home_works.informatics.Aziret;

import java.util.Scanner;

public class Razlojenie_Na_Prostye {
    private static int gcd(int a, int b){
        if(a < b) {
            int t = a;
            a = b;
            b = t;
        }
        while (b != 0) {
            a %= b;
            int t = a;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sqrt = (int) Math.floor(Math.sqrt(a));
        boolean first = true;
        // n = 34, sqrt(a) = 5

        for (int i = 2; i <= sqrt; i++) {
            int count = 0;
            while (a % i == 0) {
                count++;
                a /= i;
            }
            if(count > 0) {
                if (first) {
                    first = false;
                }
                System.out.print(i);
                if (count > 1) {
                    System.out.print("^" + count);
                }
            }
        }
        if (a > 1) {
            if (first){
                first = false;
            } else {
                System.out.print("*");
            }
            System.out.print(a);

        }

    }
}
