package org.java.home_works.informatics.Aziret;

import java.util.Scanner;

public class Soobrazim_Na_Troih {
    public static void main(String[] args)  throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            sum += digit;
        }
        System.out.println(sum % 3 == 0 ? "YES" : "NO");



    }
}
