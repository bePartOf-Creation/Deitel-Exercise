package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfIntegersTest {
        SumOfIntegers sum;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatOurConstructorWorks(){
        sum = new SumOfIntegers(0,1);
        int num = sum.getSum();
        assertEquals(0,num);

        int count = sum.getCounter();
        assertEquals(1,count);
    }

    @Test
    void testThatAnyIntegerValueEnteredIsNotANegativeValue(){
        sum = new SumOfIntegers(0,1);
        assertEquals(1,sum.getCounter());
    }

    @Test
    void testThatVariablePerformCompoundAssignmentOperatorWithMyCounter(){
        sum = new SumOfIntegers(0,1);
        int add = sum.addSumByOnes();
        assertEquals(1, add);

        add = sum.addSumByOnes();
        assertEquals(2, add);

        add = sum.addSumByOnes();
        assertEquals(3,add);
    }

 @Test
    void testThatCOUNTERIncreaseBYOne(){
        sum = new SumOfIntegers(0,1);
        sum.incrementCounter();
        assertEquals(2,sum.getCounter());

        sum.incrementCounter();
        assertEquals(3,sum.getCounter());
 }

 @Test
    void thatThatTheUserCanResetCounterAfterUsage(){
     sum = new SumOfIntegers(0,1);
     int reset = sum.resetCounter();
     assertEquals(0,reset);


     sum.incrementCounter();
     assertEquals(1,sum.getCounter());
     sum.incrementCounter();
     assertEquals(2,sum.getCounter());
     sum.incrementCounter();
     assertEquals(3,sum.getCounter());

     sum.resetCounter();
     assertEquals(0,sum.getCounter());
 }
}