package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompoundInterestTest {
        CompoundInterest interest;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testingOurConstant_Value(){
        interest  = new CompoundInterest(2.0,1000,10);
        interest.setPrincipal(2000.0);
        interest.setNumberOfYears(12);
        int rate = interest.getRate();
        interest.setAmount(12000.0);
        assertEquals(2000.0,interest.getPrincipal());
        assertEquals(12000.0,interest.getAmount());
        assertEquals(5,rate);
        assertEquals(12,interest.getNumberOfYears());
    }
    @Test
    void test_ThatCanCalculateCompoundInterest(){
        interest  = new CompoundInterest(0.0,1000,10);
        interest.setPrincipal(1000.0);
        interest.setNumberOfYears(10);
        double compoundInterest = interest.calculateCompoundInterest(0.05);
         assertEquals(1005.0112650131324,compoundInterest);
    }

}