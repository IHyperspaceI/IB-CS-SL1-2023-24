package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter11.exceptions;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var account = new BankAccount(100);

        System.out.println("Enter amount to withdraw: ");
        var amount = in.nextDouble();

        while (!in.nextLine().equalsIgnoreCase("q")) {
            try {
                account.withdraw(amount);
                System.out.println("Made it!");
            } catch (InsufficientFundsException e) {
                System.out.println(e);
            } catch (WithdrawLimitExceededException e) {
                System.out.println("Too many withdrawals!");
            }
        }
    }
}
