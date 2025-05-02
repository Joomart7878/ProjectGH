package org.java.home_works.informatics.loops;

import java.util.Scanner;

public class E_sum_of_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zeros = sc.nextInt();

        int sum_zeros = 0;
        for (int i = 0; i < zeros; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                sum_zeros ++;
            }

        }
        System.out.println(sum_zeros);
    }
}
