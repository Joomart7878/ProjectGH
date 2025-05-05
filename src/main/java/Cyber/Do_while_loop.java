package Cyber;

public class Do_while_loop {
    public static void main (String [] args) {

        int apples = 1;
        int totalApples = 10;

        do{
            System.out.println("Eating an apple - " + apples);
            apples+=2;
        } while (apples <= totalApples);

        System.out.println("No more apples");
    }
}
