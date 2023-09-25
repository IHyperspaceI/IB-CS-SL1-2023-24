package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter1;

public class FunTester {
    private static int years = 8;
    private static double initialValue = 0;
    private static double interestRate = 0.03;
    private static double money = initialValue;

    public static void main(String[] args) {
        int index = 0;

        for (index = 0; index < years; index++){
            money += 300;
            money = money * (1 + interestRate);
        }

        System.out.println(money + " Years: " + index);
    }
}
