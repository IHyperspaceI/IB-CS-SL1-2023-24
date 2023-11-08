package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

import java.util.Scanner;

public class TaxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your income:");
        double income = scanner.nextDouble();

        System.out.println("Are you married? (Y/N)");
        var input = scanner.next();
        int status = input.equalsIgnoreCase("Y")
                ? TaxReturn.MARRIED
                : TaxReturn.SINGLE;

        TaxReturn taxReturn = new TaxReturn(income, status);

        System.out.printf("Your tax is $%.2f", taxReturn.getTax());
    }
}
