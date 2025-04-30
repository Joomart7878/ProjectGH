package Cyber;

import java.util.Scanner;

public class Nested_if_else {
    public static void main(String[] args) {
        int hourOhDay = 18;

        if (hourOhDay < 12) {
            System.out.println("Good Morning");
        } else {
            if (hourOhDay < 17){
                System.out.println("Good Afternoon");
            } else {
                System.out.println("Good Evening");
            }
        }

        Scanner sc = new Scanner(System.in);


        System.out.println("If you want HOT, Select 1. If you want COLD, Select 2");

        double priceHotTea = 2;
        double priceColdTea = 3.2;
        double priceHotCoffee = 4;
        double priceColdCoffee = 3.5;


        int typeSelection = sc.nextInt();
        if (typeSelection == 1) {
            System.out.println("What do you want? Tea or Coffee? Select 1 for Tea, select 2 for coffee");
            int teaOrCoffee = sc.nextInt();
            if (teaOrCoffee == 1) {
                System.out.println("The tea price is " + priceHotTea + "$");
            } else {
                System.out.println("The coffee price is " + priceHotCoffee + "$");
            }
        } else if (typeSelection == 2) {
            System.out.println("What do you want? Select 1 for Tea, select 2 for coffee");
            int teaOrCoffee = sc.nextInt();
            if (teaOrCoffee == 1) {
                System.out.println("The tea price is " + priceColdTea + "$");
            } else {
                System.out.println("The coffee price is " + priceColdCoffee + "$");
            }
        } else {
            System.out.println("Invalid selection, try again!");
        }
    }
}
