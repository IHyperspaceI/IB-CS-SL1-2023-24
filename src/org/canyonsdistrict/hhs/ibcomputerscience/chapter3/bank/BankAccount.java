package org.canyonsdistrict.hhs.ibcomputerscience.chapter3.bank;
public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public BankAccount(){
        this.balance = 5;
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