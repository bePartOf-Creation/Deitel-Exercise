package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {
    Palindromes palindromes;
    @BeforeEach
    void setUp() {
        palindromes = new Palindromes(12345);
    }

    @AfterEach
    void tearDown() {
    }


}