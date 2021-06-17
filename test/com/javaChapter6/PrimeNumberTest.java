package com.javaChapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    PrimeNumber prime;

    @BeforeEach
    void setUp() {
        prime = new PrimeNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Validating UserInput")
    @Test
    void testThatUserInputEnteredAsPrimeIsValidated() {
        boolean isValid = PrimeNumber.validateUserInput(1);
        assertFalse(isValid);
        isValid = PrimeNumber.validateUserInput(0);
        assertFalse(isValid);
        isValid = PrimeNumber.validateUserInput(-4);
        assertFalse(isValid);
        isValid = PrimeNumber.validateUserInput(2);
        assertTrue(isValid);
        isValid = PrimeNumber.validateUserInput(1020000);
        assertTrue(isValid);
    }

}