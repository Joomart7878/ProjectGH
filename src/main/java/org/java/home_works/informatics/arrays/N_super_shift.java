package org.java.home_works.informatics.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class N_super_shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            a.add(x);
        }
        int k = sc.nextInt();
        while (k > 0) {
            ArrayList<Integer> b = new ArrayList<>();
            b.add(a.getLast());
            for (int i = 0; i < n - 1; ++i) {
                b.add(a.get(i));
            }
            a = b;
            k--;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a.get(i));
        }
    }
}

