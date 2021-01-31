package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheLargestNumberTest {
        FindTheLargestNumber largestNumber;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatOurConstructorWorks(){
        largestNumber = new FindTheLargestNumber(0);
       int num = largestNumber.getNumber();
        assertEquals(0,num);
    }

    @Test
    void testThatNumberCanBeUpdated(){
        largestNumber = new FindTheLargestNumber(0);
        largestNumber.setNumber(2);
        assertEquals(2,largestNumber.getNumber());
    }

    @Test
    void testThatNumberIsTheLargestNUmber(){
        largestNumber = new FindTheLargestNumber(0);
        largestNumber.setNumber(-1);
        largestNumber.setNumber(13);
        largestNumber.setNumber(100);
        largestNumber.setNumber(3000);
        largestNumber.getMaximumNumber();
        assertEquals(3000,largestNumber.getLargestNumber());
    }
}