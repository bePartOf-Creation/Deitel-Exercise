package com.javaChapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionTest {
    SalesCommission salesCommission;
    @BeforeEach
    void setUp() {
        salesCommission = new SalesCommission();
    }

    @Test
    void testThatOurConstructorWorks(){
       salesCommission = new SalesCommission();
       assertNotNull(salesCommission);
    }

    @Test
    void testThatTheSalePeopleBasicSalaryIsConstant(){
        int basicSalary = salesCommission.getBasicSalary();
        assertEquals(200,basicSalary);
    }
    @Test
    void testThatTheCommissionRateIsConstant(){
        double rate = salesCommission.getCommissionRate();
        assertEquals(0.09,rate);
    }
    @Test
    void testThatTheGrossPayCanBeCalculated(){
        int grossPay = salesCommission.calculateTotalSalary(5000);
        assertEquals(650,grossPay);
   }
   @Test
    void testThatTheTotalSalaryWithSalesPeopleGrossSalary(){
       salesCommission.calculateRangeOfSalary(5000,5000,5000,3000);
   }

}