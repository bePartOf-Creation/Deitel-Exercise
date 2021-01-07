package com.javaChapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testUserAccount_CanHaveAnAccountName() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        String accountName = newAccount.getAccountName();
        assertEquals("Ola", accountName);
    }

    @Test
    void testThatUserAccountName_CanBeUpdated() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        newAccount.setAccountName("Olayinka");
        assertEquals("Olayinka", newAccount.getAccountName());

    }

    @Test
    void testUserThatUserAccount_CanHaveBalance() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        double accountBalance = newAccount.getAccountBalance();
        assertEquals(5000.0, accountBalance);
    }

    @Test
    void testUserThatUserCanDepositMoney() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        newAccount.depositMoney(5000.0);
        assertEquals(10000.0, newAccount.getAccountBalance());
    }
    @Test
    void testUserThatUserAccountCannotHaveDepositInvalidAmount() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        newAccount.depositMoney(-1000.0);
        assertEquals(5000.0, newAccount.getAccountBalance());
    }
    @Test
    void testUserThatUserAccountCanWithdrawAmount() {
        Account newAccount = new Account("Ola", 5000.0, 1107);

        newAccount.withdrawMoney(1000.0);
        assertEquals(4000.0, newAccount.getAccountBalance());
    }
    @Test
    void testUserThatUserAccountCannotWithdrawInvalidAmount() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        newAccount.withdrawMoney(10000.0);
        assertEquals(5000.0, newAccount.getAccountBalance());
    }
    @Test
    void testUserThatUserAccountBalance_CanBeUpdated() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        newAccount.setAccountBalance(1500.0);
        assertEquals(1500.0, newAccount.getAccountBalance());
    }

    @Test
    void testThatUserAccountBalance_CannotHaveNegativeValue() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        newAccount.setAccountBalance(-1500.0);
        assertEquals(5000.0, newAccount.getAccountBalance());
    }

    @Test
    void testThatUserAccount_CanBeHavePin() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        int pin = newAccount.getPin();
        assertEquals(1107, pin);
    }

    @Test
    void testThatUserAccount_PinCanBeConfirmed() {
        Account newAccount = new Account("Ola", 5000.0, 1107);
        boolean accountPin = newAccount.confirmPin(1107);
        assertTrue(newAccount.confirmPin(1107));
        assertFalse(newAccount.confirmPin(-110700));
    }

    @Test
    void testThatUserAccount_CannotInputInvalidValueAsPin() {
        Account newAccount = new Account("Ola", 1500.0, 1106);
        newAccount.confirmPin(-1106);
        assertFalse( newAccount.confirmPin(-11006));
   }

   @Test
   void testThatUserAccountPin_CanBeChanged() {
        Account newAccount = new Account("Ola", 1500.0, 1106);
        newAccount.changePin(1106,22334);
        newAccount.confirmPin(1106);
        assertTrue(newAccount.confirmPin(22334));
   }

}