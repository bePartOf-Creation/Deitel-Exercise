package com.javaChapter1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionInArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testArrayCanCalculateSum(){
        AdditionInArray newSumArray = new AdditionInArray();
        int[] studentScore = {2,2,2,2,2};
        int sum = newSumArray.CalculateSum(studentScore);
        assertEquals(10,sum);
    }

    @Test
    void testArrayCanCalculateAverage(){
        AdditionInArray newSumArray = new AdditionInArray();
        int[] studentScores = {2,2,2,2,2};
        double average = newSumArray.CalculateAverage(studentScores);
        assertEquals(2.0,average);
    }

}