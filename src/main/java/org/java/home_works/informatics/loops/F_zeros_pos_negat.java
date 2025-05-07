package org.java.home_works.informatics.loops;

import java.util.Scanner;

public class F_zeros_pos_negat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int zeros = 0;
        int positive = 0;
        int negative = 0;
        
        for (int i = 0; i < n; i++) {
            int numbers = sc.nextInt();
            if (numbers == 0) {
                zeros++;
            } else if (numbers > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println(zeros + " " + positive + " " + negative);
    }
}
