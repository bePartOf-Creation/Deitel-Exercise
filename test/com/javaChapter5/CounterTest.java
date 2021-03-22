package com.javaChap4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    Counter counter;

    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testCounterWorks() {
        counter = new Counter(0);
        int count = counter.getCounter();
        assertEquals(0, count);
    }

    @Test
    void testCounterCanBeChanged(){
        counter = new Counter(0);
        counter.setCounter(2);
        assertEquals(2, counter.getCounter());
    }

    @Test
    void testThatCounterCountsFromOneToTen(){
        counter = new Counter(0);
        int count = counter.displayCounter();
        assertEquals(11,count);
    }

    @Test
    void testThatCountIsGreaterThanTen(){
        counter = new Counter(0);
        counter.setCounter(11);
        String message = counter.isCountGreaterThanTen();
        assertEquals("Count is greaterThan 10",message);

        counter.setCounter(-11);
        message = counter.isCountGreaterThanTen();
        assertEquals("Count is Lesser Than 10",message);
    }
}