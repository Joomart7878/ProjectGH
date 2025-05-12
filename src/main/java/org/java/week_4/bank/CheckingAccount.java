package org.java.week_4.bank;

public class CheckingAccount {
    // Encapsulation, hide the balance from the external access
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }
    public void deposit (double amount) {
        this.balance += amount;
    }
    public void withdrow (double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Limited balance ");
        }

    }
    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }
}
