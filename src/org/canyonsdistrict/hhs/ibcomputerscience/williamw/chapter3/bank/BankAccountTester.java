package org.canyonsdistrict.hhs.ibcomputerscience.chapter3.bank;
public class BankAccountTester {
    public static void main(String[] args) {
        var checking = new BankAccount(69);
        var savings = new BankAccount();

        savings.deposit(5_000);

        System.out.println(checking.getBalance());
        System.out.println(savings.getBalance());
    }
}