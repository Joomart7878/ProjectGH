package org.java.home_works.informatics.Aziret;

import java.util.Scanner;

public class Shesterenki {

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
        int b = scanner.nextInt();

        System.out.println(a * 1L * b / gcd(a, b));



    }
}
