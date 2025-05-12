package org.java.week_4.bank;

public class Account {
    public double balance;

    public Account (double balance) {
        this.balance = balance;
    }
    public void deposit (double amount) {
        this.balance += amount;
    }
    public void withdrow (double amount) {
        this.balance -= amount;
    }
}
