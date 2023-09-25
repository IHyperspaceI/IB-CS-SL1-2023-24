package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter3.bank;
public class BankAccountTester {
    public static void main(String[] args) {
        var checking = new BankAccount(69, "Laugh at this user's checking!");
        var savings = new BankAccount("Laugh at this user's savings!");

        System.out.println("Name before: " + savings.getName());
        savings.setName("The new line account\n");
        System.out.println("Name after: " + savings.getName());


        savings.deposit(5_000);

        System.out.println(checking.getName() + ": " + checking.getBalance());
        System.out.println(savings.getName() + ": " + savings.getBalance());
    }
}