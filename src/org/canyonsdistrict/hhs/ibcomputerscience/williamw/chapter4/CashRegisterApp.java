package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter4;

public class CashRegisterApp {
    public static void main(String[] args) {
        var register = new CashRegister();
        register.scanItem(5.00);
        register.scanItem(2.45);
        register.scanItem(150.99);


        register.makePayment(157, 10, 20, 15, 21);

        //System.out.println("Average cost:");
        System.out.printf("Average item cost: %7s $%.2f\n", "", register.getAverage());
        System.out.printf("Change amount: %11s $%.2f", "", register.getChange());


        // P Parentheses
        // E Exponents
        // M Multiplication
        // D Division
        // A Addition
        // S Subtraction
    }
}
