package org.java.week_4.bank;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(0);

        myAccount.deposit(50);

        myAccount.withdrow(20);

        System.out.println(myAccount.balance);

    }
}
