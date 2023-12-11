package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6.investment;

public class Investment {
    private double balance;
    private double interestRate;
    private int year;

    public Investment(double balance, double interestRate){
        this.year = 0;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getYears(){
        return year;
    }

    public double getBalance(){
        return balance;
    }

    public void calculate(int numOfYears){
        //Initialization, Condition, Update
        for(
                year = 0;
                year < numOfYears;
                year++){
            double interest = balance * interestRate;
            balance += interest;
        }
    }

    private void calculateOneYear() {
        double interest = balance * interestRate;
        balance += interest;
        year++;
    }

    public int calculate(double target){
        while (balance < target){
            calculateOneYear();
        }
        return year;
    }
}
