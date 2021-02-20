package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

   @Test
    void testThatOurConstructorWorks(){
        factorial = new Factorial(0);
        int num = factorial.getInputNumber();
        assertEquals(0 , num);
   }
    @Test
    void testThatOurInputNumberCanBeUpdated(){
        factorial = new Factorial(0);
       factorial.setInputNumber(1);
        assertEquals(1 , factorial.getInputNumber());
    }
}