package org.java.week_5.abstract_classes.bank;

public class CheckingAccount extends Account {

    CheckingAccount(int amount) {
        super(amount);
    }

    void withdraw(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        }
    }

    void deposit(int amount) {
        this.amount += amount;
    }
}
