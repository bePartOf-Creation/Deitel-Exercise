package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTenIntegersTest {
        SumTenIntegers sum;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatConstructorWorks(){
        sum = new SumTenIntegers();
        int add = sum.sumIntegersOfTenNumbers();
        assertEquals(55,add);
    }
    @Test
    void testDisplaySumMessage(){
        sum = new SumTenIntegers();
        int add = sum.sumIntegersOfTenNumbers();
        String message = sum.displaySumMessage();
        assertEquals("Sum Of Ten Numbers " + add, message);

    }
}