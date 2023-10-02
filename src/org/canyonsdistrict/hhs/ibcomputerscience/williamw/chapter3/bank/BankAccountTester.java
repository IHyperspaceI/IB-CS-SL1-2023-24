package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter3.bank;

import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        var checking = new BankAccount(69, "Laugh at this user's checking!");
        var savings = new BankAccount("Laugh at this user's savings!");
        var scanner = new Scanner(System.in);

        System.out.println("Enter new account name:");
        var name = scanner.nextLine();

        System.out.println("Enter new account initial balance:");
        var newBalance = scanner.nextDouble();

        var userAccount = new BankAccount(newBalance, name);
        System.out.printf("New account created with name '%s' and a balance of $%.2f%n", name, newBalance);
    }
}