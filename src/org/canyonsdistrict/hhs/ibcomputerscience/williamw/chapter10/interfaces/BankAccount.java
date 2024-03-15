package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.interfaces;

public class BankAccount implements Measurable, Comparable<BankAccount> {
    private double balance;

    public BankAccount (double balance) {
        this.balance = balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }

    public String toString() {
        return "Balance: " + balance;
    }

    public String getDescription() {
        return "This is an account";
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(BankAccount other) {
        if (balance < other.balance) {
            return -1;
        } else if (balance > other.balance) {
            return 1;
        } else {
            return 0;
        }
    }

    /* Old
    @Override
    public int compareTo(Object other) {
        if (other instanceof BankAccount) {
            var o = (BankAccount) other;

            if (balance < o.balance) {
                return -1;
            } else if (balance > o.balance) {
                return 1;
            } else {
                return 0;
            }
        }
        return  0;
    }*/
}