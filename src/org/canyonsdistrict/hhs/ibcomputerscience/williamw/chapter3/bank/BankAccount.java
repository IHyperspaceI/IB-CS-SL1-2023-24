package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter3.bank;

/**
 * A class for tracking balances in a bank with deposit, withdraw, and balance checking
 */
public class BankAccount {
    private double balance;
    private String name;

    /**
     * Creates an instance of a bank account with a starting balance and name
     * @param initialBalance the starting balance of the account
     * @param name the starting name of the account
     */
    public BankAccount(double initialBalance, String name){
        this.balance = initialBalance;
        this.name = name; // this specifies the instance variable not the local variable
    }

    /**
     * Creates an instance of a bank account with a name
     * The balance is set to the default, $5
     * @param name the starting name of the account
     */
    public BankAccount(String name){
        this(5, name); // Calls the other constructor that takes this arg
    }

    /**
     * Creates an instance of a bank account with the default values ($5 and named "Savings")
     */
    public BankAccount(){
        this(5, "Savings"); // Calls the other constructor that takes this arg
    }

    /**
     * Gets the balance of the account
     * @return the balance of the account
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Deposits the specified amount into the account
     * @param depositAmount the amount to deposit
     */
    public void deposit(double depositAmount){
        balance = balance + depositAmount;
    }

    /**
     * withdraws an amount out of the account
     * @param withdrawAmount the amount to withdraw
     */
    public void withdraw(double withdrawAmount){
        balance = balance - withdrawAmount;
    }

    /**
     * Gets the name of the account
     * @return the name of the account
     */
    public String getName(){
        return this.name;
    }

    /**
     * Changes the name of the account
     * @param newName the new account name
     */
    public void setName(String newName){
        this.name = newName;
    }
}