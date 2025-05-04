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
    }
}
