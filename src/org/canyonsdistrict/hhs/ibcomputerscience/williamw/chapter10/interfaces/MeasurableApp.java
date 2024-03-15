package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.interfaces;

import java.util.Arrays;
import java.util.Scanner;

public class MeasurableApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(500);
        accounts[1] = new BankAccount(250);
        accounts[2] = new BankAccount(69000);

        Measurable[] countries = new Measurable[3];
        countries[0] = new Country(500_000_000);
        countries[1] = new Country(12_500_000);
        countries[2] = new Country(69_000_000);

        Measurable[] books = new Measurable[3];
        books[0] = new Book(100);
        books[1] = new Book(250);
        books[2] = new Book(300);

        double averageBalance = Data.average(accounts);
        double averagePopulation = Data.average(countries);
        double averagePageNum = Data.average(books);

        System.out.printf("Average account balance: $%.2f\n", averageBalance);
        System.out.printf("Average country population: %.2f\n", averagePopulation);
        System.out.printf("Average page num: %.2f\n", averagePageNum);


        System.out.println(accounts[0].getDescription());
        System.out.println(books[0].getDescription());

        System.out.println("Enter a value");
        System.out.println("1 - Bank account");
        System.out.println("2 - Country");
        System.out.println("3 - Book");

        int choice = in.nextInt();

        if (choice == 1) {
            for (var account : accounts) {
                if (account instanceof BankAccount) {
                    ((BankAccount) account).deposit(69);
                    System.out.printf("Balance is: %.2f\n", ((BankAccount) account).getBalance());
                }
            }
        }

        System.out.println(Arrays.toString(accounts));
        Arrays.sort(accounts);
        System.out.println(Arrays.toString(accounts));

    }
}
