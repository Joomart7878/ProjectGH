package Cyber;

import java.util.Scanner;

public class If_Else_statement {
    public static void main(String[] args) {
        boolean isWeatherNice = false;

        if (isWeatherNice) {
            System.out.println("Lets go swimming");
        } else {
            System.out.println("Stay home \n watch movie");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username and password: ");
        String userName = sc.next();
        String password = sc.next();

        String valieUserName = "superuser";
        String validPas = "12345";

        if(userName.equals(valieUserName) && validPas.equals(password)) {
            System.out.println("Access graned. Welcome!");
        } else {
            System.out.println("Access denied");
        }

        System.out.println("Enter your current speed");
        int speed = sc.nextInt();
        if (speed > 60) {
            System.out.println("Slow down");
            int diff = speed - 60;
            speed -= diff;
        } else {
            System.out.println("Keep driving");
        }
        System.out.println(speed);
    }
}
