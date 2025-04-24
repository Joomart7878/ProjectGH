package Cyber;

import java.util.Scanner;

public class Multi_branch_If_else {
    public static void main(String[] args) {
        char grade = 'D';

        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Good");
        } else if (grade == 'C') {
            System.out.println("Not Bad");
        } else {
            System.out.println("Could be Better");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your shoe size");
        int size = sc.nextInt();

        if(size > 12) {
            System.out.println("Sorry, is not in stock");
        } else if (size >= 6) {
            System.out.println("Is in stock");
        } else {
            System.out.println("Soorry, this store only for big size");
        }

        System.out.println("Enter number");
        int number = sc.nextInt();

        if (number >= 0 && number <= 100) {
            System.out.println("Number is between 0 and 100");
        } else if (number > 100 && number <= 1000) {
            System.out.println("Number is between 100 and 1000");
        } else if (number > 1000 && number <= 1000000) {
            System.out.println("Number is between 1000 and 1000000");
        } else {
            System.out.println("Number is either negative or more than million");
        }
    }
}
