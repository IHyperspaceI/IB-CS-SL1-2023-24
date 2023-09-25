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
}
