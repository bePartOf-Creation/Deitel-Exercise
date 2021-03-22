package com.myFirstTest.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
         Account myAccount;

    @BeforeEach
    void setUp() {
        myAccount = new Account(0,1111);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testUserCanChangePin(){
         myAccount.setPin(1111,1235);
         int pin =  myAccount.getPin();
         assertEquals(1235,pin);

    }
    @Test
    void testThatUserInputWrongOldPin(){
        myAccount.setPin(1112,1235);
        int pin = myAccount.getPin();
        assertEquals(1111,pin);
    }

//    @Test
//    void testMoneyCanBeDeposited() {
//        Account myAccount = new Account();
//        myAccount.depositMoney(50);
//        int balance = myAccount.getAccountBalance();
//        assertEquals(50, balance);
//
//        myAccount.depositMoney(100);
//        balance = myAccount.getAccountBalance();
//        assertEquals(150, balance);
//    }
//
//}
//@Test
//void testMoneyCanBeDeposited(){
//
//    newAccount.depositCash(100);
//    int balance = newAccount.getAccountBalance();
//    assertEquals(balance, 100);
//
//    newAccount.depositCash(300);
//    balance = newAccount.getAccountBalance();
//    assertEquals(400,balance);
//
//    newAccount.depositCash(200);
//    balance = newAccount.getAccountBalance();
//    assertEquals(600,balance);
//    }
//
//@Test
// void testDepositCashWillNotReceiveNegativeValue(){
//        Account newAccount = new Account();
//        newAccount.depositCash(1000);
//        newAccount.depositCash(-200);
//        int balance = newAccount.getAccountBalance();
//        assertEquals(1000,balance);
//}


@Test

void moneyCanBeDepositedTest(){
        myAccount.depositMoney(100);
       int balance = myAccount.getAccountBalance();
       assertEquals(100,balance);

       myAccount.depositMoney(200);
       balance = myAccount.getAccountBalance();
       assertEquals(300,balance);
}

@Test
void testMoneyWithNegativeValueWillNotBeAccepted(){
        myAccount.depositMoney(300);
        myAccount.depositMoney(-500);
        int balance = myAccount.getAccountBalance();
        assertEquals(300,balance);

        myAccount.depositMoney(1000);
        myAccount.depositMoney(-2000);
        balance = myAccount.getAccountBalance();
        assertEquals(1300,balance);
}

@Test
void testMoneyCanBeWithdrawn(){
       myAccount.depositMoney(1300);
       myAccount.withdrawMoney(500);
       int balance = myAccount.getAccountBalance();
       assertEquals(800,balance);



       myAccount.depositMoney(800);
       myAccount.withdrawMoney(100);
       balance = myAccount.getAccountBalance();
       assertEquals(1500,balance);
     }
}





















