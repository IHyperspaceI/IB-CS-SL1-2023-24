package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6.investment;

public class InvestmentApp {
    public static void main(String[] args) {
        final double INITIAL_BALANCE = 10_000;
        final double INTEREST_RATE = 0.05;

        var investmentCalculator = new Investment(INITIAL_BALANCE, INTEREST_RATE);

        investmentCalculator.calculate(50);

        System.out.printf("The investment doubled after %d years for a balance of $%.2f", investmentCalculator.getYears(), investmentCalculator.getBalance());
    }
}
