package com.javaChapter4;

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
    void testThatUserInputIsValidated(){
        factorial = new Factorial(3);
        factorial.setInputNumber(10);
        assertEquals(10.0,factorial.getInputNumber());
    }
@Test
    void testThat_GenerateTheFactorial(){
    factorial = new Factorial(0);
     factorial.setInputNumber(3);
     factorial.calculateFactorial();
     assertEquals(6,factorial.getInputNumber());
}
@Test
    void testToDisplayOutputMessage(){
         factorial = new Factorial(0);
         factorial.setInputNumber(3);
         factorial.calculateFactorial();
         String display = factorial.getMessage();
         assertEquals("The Factorial of your input " + " is " + factorial.getInputNumber(),display);
}
}