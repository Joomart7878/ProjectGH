package Cyber;

import java.util.Scanner;

public class While_looping {
    public static void main (String [] args) {
        int apples = 1;

        while (apples <= 10) {
            System.out.println("Eating an apples");
            apples++;
        }
        System.out.println("No more apples :(");

        Scanner sc = new Scanner(System.in);

        int number, count;

        System.out.println("Enter a number: ");
        number = sc.nextInt();

        count = 1;
        while (count <= number) {
            System.out.print(count + ", ");
            count+=2;
        }

        int total = 0;
        System.out.println("Enter positive number");
        int next = sc.nextInt();

        while (next > 0) {
            total = total + next;
            next = sc.nextInt();
        }
        System.out.println("Sum of all numbers: " + total);
    }
}
