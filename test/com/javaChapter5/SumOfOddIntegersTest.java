package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddIntegersTest {
    SumOfOddIntegers sumOfOddIntegers;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


@Test
    void testThat_UserCanSumOddIntegersFrom1to99(){
    sumOfOddIntegers = new SumOfOddIntegers();
    int sum = sumOfOddIntegers.addOddIntegers();
    assertEquals(2500,sum);
}


}