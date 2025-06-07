package org.java.home_works.informatics.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class I_shift_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }
        ArrayList<Integer> b = new ArrayList<>();
        b.add(a.getLast());
        System.out.printf("%d ", a.getLast());
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%d ", a.get(i));

        }
    }
}
