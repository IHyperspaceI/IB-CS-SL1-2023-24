package org.canyonsdistrict.hhs.ibcomputerscience.chapter3.bank;
public class BankAccount {
    private double balance;
    private String name;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public BankAccount(){
        this(5); // Calls the other constructor that takes this arg
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double depositAmount){
        balance = balance + depositAmount;
    }

    public void withdraw(double withdrawAmount){
        balance = balance - withdrawAmount;
    }
}