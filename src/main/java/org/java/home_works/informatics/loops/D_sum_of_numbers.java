package org.java.home_works.informatics.loops;

import java.util.Scanner;

public class D_sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < a; i++) {
            int number = sc.nextInt();
            sum = sum + number;
        }

        System.out.println(sum);
    }
}
