package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter11.exceptions;

public class BankAccount {
    private double balance;
    private int count;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (balance + 500 < amount) {
            throw new InsufficientFundsException("You REALLY don't have that much money you broke ass!");
        } else if (balance < amount) {
            throw new InsufficientFundsException("You don't have that much money you broke ass!");
        }

        if (count >= 3) {
            throw new WithdrawLimitExceededException();
        }

        this.balance -= amount;
        count++;
    }
}
