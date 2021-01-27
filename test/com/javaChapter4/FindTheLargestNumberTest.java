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
        int largest = largestNumber.getLargest();
        assertEquals(0,num);
        assertEquals(0,largest);
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
        int largest = largestNumber.getMaximumNumber();
        assertEquals(10, largest);
    }
}