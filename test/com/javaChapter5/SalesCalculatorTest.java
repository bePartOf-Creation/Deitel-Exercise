package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SalesCalculatorTest {
    SalesCalculator calculator;
    @BeforeEach
    void setUp() {
    }


    @AfterEach
    void tearDown() {
    }
@Test
    void test_ThatConstructorsWorks(){
        calculator = new SalesCalculator(1,1,1.0);
        int productNumber = calculator.getProductNumber();
        int quantity = calculator.getQuantitySold();
        double retailValue = calculator.getRetailValue();

        assertEquals(1,productNumber);
        assertEquals(1,quantity);
        assertEquals(1.0,retailValue);


}
     @Test
    void test_ThatQuantitySoldCanBeUpdated(){
        calculator = new SalesCalculator(1,1,1.0);
        calculator.setQuantitySold(1);
        assertEquals(1,calculator.getQuantitySold());
    }
    @Test
    void test_ThatProductNumberCanBeUpdated(){
        calculator = new SalesCalculator(1,1,1.0);
        calculator.setProductNumber(2);
        assertEquals(2,calculator.getProductNumber());
    }
@Test
void testToGetPrice(){
    calculator = new SalesCalculator(1,1,1.0);
    calculator.getRetailValueByProductNumber(2);
    double price = calculator.getPrice();
    assertEquals(4.5,price);

    calculator.getRetailValueByProductNumber(3);
    price = calculator.getPrice();
    assertEquals(9.98,price);
}
@Test
    void testThatUserEnterGetRetailValueByProductNumber(){
        calculator = new SalesCalculator(1,1,1.0);
        calculator.setProductNumber(1);
    double value = calculator.getRetailValueByProductNumber(1);
    assertEquals(2.98,value);

    calculator.setProductNumber(2);
    value = calculator.getRetailValueByProductNumber(2);
    assertEquals(4.50,value);

    calculator.setProductNumber(3);
   value = calculator.getRetailValueByProductNumber(3);
    assertEquals(9.98,value);

    calculator.setProductNumber(4);
    value = calculator.getRetailValueByProductNumber(4);
    assertEquals(4.49,value);

    calculator.setProductNumber(5);
    value = calculator.getRetailValueByProductNumber(5);
    assertEquals(6.87,value);
}


}