package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter3.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    BankAccount testAccount = new BankAccount();
    @Test
    public void testDefaultConstructure(){
        var testAccount = new BankAccount();
        Assertions.assertEquals(5, testAccount.getBalance());
        Assertions.assertEquals("Savings", testAccount.getName());
    }

@Test
    public void testAllArgsConstructor(){
    var testAccount = new BankAccount(100, "Testing Account");
    Assertions.assertEquals(100, testAccount.getBalance());
    Assertions.assertEquals("Testing Account", testAccount.getName());
    }

    @Test
    public void testDeposit(){
        var testAccount = new BankAccount();
        testAccount.deposit(5);
        Assertions.assertEquals(10, testAccount.getBalance());
    }

    @Test
    public void testWithdraw(){
        var testAccount = new BankAccount();
        testAccount.withdraw(5);
        Assertions.assertEquals(0, testAccount.getBalance());
    }


    @Test
    public void testWithdrawFromATM(){
        var testAccount = new BankAccount(10, "10");
        testAccount.withdrawFromATM(10);
        Assertions.assertEquals(-1.0, testAccount.getBalance());
    }

    @Test
    public void testNameChange(){
        var testAccount = new BankAccount("hi");
        testAccount.setName("lol");
        Assertions.assertEquals("lol", testAccount.getName());
    }
}
