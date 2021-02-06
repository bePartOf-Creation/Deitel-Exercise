package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingUserInputTest {
    ValidatingUserInput valid;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

@Test
    void test_ThatPassesIsEqualToOne(){
        valid = new ValidatingUserInput(0,0);
        valid.passIsEqualTo(1);
        assertEquals(1,valid.getPasses());
        valid.passIsEqualTo(1);
        assertEquals(2, valid.getPasses());
        valid.passIsEqualTo(1);
        assertEquals(3, valid.getPasses());
}
    @Test
    void test_ThatFailIsEqualToTwo(){
        valid = new ValidatingUserInput(0,0);
        valid.failsIsEqualTo(2);
        assertEquals(1,valid.getFails());
        valid.failsIsEqualTo(2);
        assertEquals(2,valid.getFails());
        valid.failsIsEqualTo(2);
        assertEquals(3,valid.getFails());

    }


}