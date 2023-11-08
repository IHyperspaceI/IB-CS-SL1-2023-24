package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter4;

public class CashRegister {
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKLE_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    private double purchaseAmount;

    private double payment;

    private int numItems;

    public CashRegister(){
        purchaseAmount = 0;
        payment = 0;
        numItems = 0;
    }

    public void scanItem(double itemCost){
        purchaseAmount += itemCost;
        numItems++; // Unary operator - increment operator
        ++numItems;
    }

    public void makePayment(int dollars, int quarters, int dimes, int nickles, int pennies){
        payment = dollars +
                quarters * QUARTER_VALUE +
                dimes * DIME_VALUE +
                nickles * NICKLE_VALUE +
                pennies * PENNY_VALUE;
    }

    public double getChange(){
        double change = payment - purchaseAmount;

        payment = 0;
        purchaseAmount = 0;
        numItems = 0;

        return change;
    }

    public double getAverage(){
        return purchaseAmount / numItems;
    }
}
