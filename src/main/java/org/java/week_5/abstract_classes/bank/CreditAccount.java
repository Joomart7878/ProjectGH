package org.java.week_5.abstract_classes.bank;

public class CreditAccount extends Account{
    private int limit;

    CreditAccount(int amount, int limit) {
        super(amount);
        this.limit = limit;
    }

    @Override
    void withdraw(int amount) {
        if (Math.abs(this.amount - amount) <= limit) {
            this.amount -= amount;
        }
    }

    @Override
    void deposit(int amount) {
        this.amount += amount;
    }
}
