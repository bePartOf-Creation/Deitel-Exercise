package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {
    CreditLimitCalculator creditCalc;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatConstructorWorks(){
        creditCalc = new CreditLimitCalculator("241091", 150.0, 0,  0, 0);
        String accountNum = creditCalc.getAccountNumber();
        assertEquals("241091",accountNum);

        double balance = creditCalc.getBalance();
        assertEquals(150.0,balance);

        int items = creditCalc.getItems();
        assertEquals(0.0,items);

        int charges = creditCalc.getItemCharges();
        assertEquals(0,charges);

        int creditLimit = creditCalc.getCreditLimit();
        assertEquals(100000,creditLimit);
    }
    @Test
    void testThatConstantValueForItemsChargesIs0(){
        creditCalc = new CreditLimitCalculator("241091", 150.0, 0, 0, 0);
        int charges = creditCalc.getItemCharges();
        assertEquals(0,charges);
    }
    @Test
    void testThatConstantValueForCreditLimitIs100000(){
        creditCalc = new CreditLimitCalculator("241091", 150.0, 0, 0, 0);
        int creditLimit = creditCalc.getCreditLimit();
        assertEquals(100000,creditLimit);
    }

    @Test
    void testThatInitialBalanceCanBeUpdated(){
        creditCalc = new CreditLimitCalculator("241091", 150.0, 0, 0, 0);
        creditCalc.setBalance(10.0);
        assertEquals(10.0,creditCalc.getBalance());
    }
    @Test
    void testThatUserCannotInputANegativeValueForInitialBalance(){
        creditCalc = new CreditLimitCalculator("241091",  150.0,0, 0, 0);
        creditCalc.setBalance(-10.0);
        assertEquals(150.0,creditCalc.getBalance());
    }
    @Test
    void testThatUserCanCalculateTotalCredits(){
        creditCalc = new CreditLimitCalculator("241091", 150.0, 0, 0, 0);
        creditCalc.setNumOfCreditsCollected(4);
        double sum = creditCalc.calculateTotalCredits();
        assertEquals( 4000.0,sum);

        creditCalc = new CreditLimitCalculator("241091", 150.0, 0,  0, 0);
        creditCalc.setNumOfCreditsCollected(3);
        sum = creditCalc.calculateTotalCredits();
        assertEquals( 140000.0,sum);
    }

    @Test
    void testThatUserCanInputNumberOfCreditCollected(){
        creditCalc = new CreditLimitCalculator("241091",150.0,0, 0,0);
        int count = creditCalc.getNumOfCreditsCollected();
        assertEquals(0,count);
    }

    @Test
    void testThatUserCanUpdatedNumberOfCreditCollected(){
        creditCalc = new CreditLimitCalculator("241091",150.0,0,  0,0);
        creditCalc.setNumOfCreditsCollected(2);
        assertEquals(2,creditCalc.getNumOfCreditsCollected());
    }
    @Test
    void testThatUserCanGetTotalCharges(){
        creditCalc = new CreditLimitCalculator("241091",150.0,0,  2, 0);
        int total = creditCalc.calculateTotalCharges();
        assertEquals(10,total);
    }
@Test
    void testThatCreditsDoesExit100000(){
    creditCalc = new CreditLimitCalculator("241091", 150.0, 0,  0, 0);
    creditCalc.setNumOfCreditsCollected(3);
    creditCalc.checkCreditLimit();
    assertEquals("Credit Limit Not Exceeded",creditCalc.displayCreditLimit() );

    creditCalc = new CreditLimitCalculator("241091", 150.0, 0,  0, 0);
    creditCalc.setNumOfCreditsCollected(2);
    creditCalc.checkCreditLimit();
    assertEquals("Credit Limit Exceeded",creditCalc.displayCreditLimit());
}
@Test
    void displayMessageTest(){
    creditCalc = new CreditLimitCalculator("241091", 150.0, 0,  0, 0);
    creditCalc.setNumOfCreditsCollected(2);
    creditCalc.checkCreditLimit();
    assertEquals("Credit Limit Not Exceeded",creditCalc.displayCreditLimit());

    creditCalc = new CreditLimitCalculator("241091", 150.0, 0,  0, 0);
    creditCalc.setNumOfCreditsCollected(2);
    creditCalc.checkCreditLimit();
    assertEquals("Credit Limit Exceeded",creditCalc.displayCreditLimit());
    }

    @Test
    void testNewBalance(){
        creditCalc = new CreditLimitCalculator("241091", 150.0, 0,  10, 0);
        creditCalc.setNumOfCreditsCollected(10);
        creditCalc.setBalance(150.0);
        creditCalc.calculateTotalCharges();
        double balance = creditCalc.checkNewBalance();
        assertEquals(-139800, balance);
   }

}