package com.javaChapter8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    SavingsAccount savingsAccount;
    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }
@Test
    void testThat_UserCanHaveSavingsBalance(){
    savingsAccount = new SavingsAccount(0.0);
    double balance = savingsAccount.getSavingsBalance();
    assertEquals(0.0,balance);
}
@Test
void testThat_TwoSaversCanHaveADifferentSavingsBalances(){
        savingsAccount = new SavingsAccount(5000.0);
        savingsAccount.deposit(20000.0);
        assertEquals(25000.0,savingsAccount.getSavingsBalance());
}
@Test
    void testThat_SavingsAccountCanHaveAnnualInterestRate(){
        savingsAccount = new SavingsAccount(0.0);
        SavingsAccount.modifyAnnualInterestRate(0.04);
        assertEquals(0.04,SavingsAccount.getAnnualInterestRate());
}
@Test
    void testThat_SavingsAccountCanHaveCalculateMonthlyInterestRate(){
        savingsAccount = new SavingsAccount(0.0);
        SavingsAccount.modifyAnnualInterestRate(0.05);
        assertEquals(0.05,SavingsAccount.getAnnualInterestRate());
}
@Test
    void test_ThatUserCanCalculateMonthlyInterestRate(){
        savingsAccount = new SavingsAccount(0.0);
        savingsAccount.deposit(20000.0);
        SavingsAccount.modifyAnnualInterestRate(0.04);
        savingsAccount.calculateMonthlyInterest();
        assertEquals(20066.66666666666667,savingsAccount.getSavingsBalance());
}


}