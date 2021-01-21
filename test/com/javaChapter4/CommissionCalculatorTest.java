package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionCalculatorTest {
        CommissionCalculator commission;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatConstructors(){
        commission = new CommissionCalculator(0, 0);
        double itemsValue = commission.getItemValue();
        double numOfItems = commission.getNumOfItems();
        assertEquals(0.0, itemsValue);
        assertEquals(0.0, numOfItems);
    }

    @Test
    void testThatItemsValueCanBeUpdated(){
        commission = new CommissionCalculator(0, 0.0);
        commission.setItemValue(23.45);
        assertEquals(23.45,commission.getItemValue());
    }
    @Test
    void testThatNumberOfItemsCanBeUpdated(){
        commission = new CommissionCalculator(0, 0.0);
        commission.setNumOfItems(2);
        assertEquals(2,commission.getNumOfItems());
    }

    @Test
    void testThatSumAllItemsValueSoldByASalesPerson() {
        commission = new CommissionCalculator(0, 0.0);
        commission.setItemValue(23.0);
        double sum = commission.addItems(200.0);
        assertEquals(223.0, sum);

        sum = commission.addItems(400);
        assertEquals(623.0, sum);
    }

    @Test
    void  testThatCalculateSaleCommission(){
        commission = new CommissionCalculator(0,0.0);
        commission.addItems(6000);
        commission.calculateCommission();
        assertEquals("Your Salary for lastWeek is "+ 740.0,commission.displaySalaryMessage());
    }

    @Test
    void  testThatDisplaySaleCommission(){
        commission = new CommissionCalculator(0,0);
        commission.addItems(6000);
        commission.calculateCommission();
        String display = commission.displaySalaryMessage();
        assertEquals("Your Salary for lastWeek is " + 740.0,display);

    }
}