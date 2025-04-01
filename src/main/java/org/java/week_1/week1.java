package org.java.week_1;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class week1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = Math.abs(rand.nextInt()) % 100;
        System.out.println(number);

        Scanner sc = new Scanner(System.in);
//        int guess = sc.nextInt();
//

        int guess = -1;
        while (guess != number){
            guess = sc.nextInt();

            if (number == guess){
                System.out.println("You win");
            } else {
                if (guess < number) {
                    System.out.println("less, go again");
                } else {
                    System.out.println("greater, go again");
                }
            }
        }
    }}