package com.javaChapter4;


import com.javaChapter1.SeparatingDigitsInInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {
        //SeparatingDigitsInInteger separatingDigitsInInteger;
        Palindromes palindromes;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThat_CanUseSeparateFiveDigits(){
        //separatingDigitsInInteger = new SeparatingDigitsInInteger();
        palindromes = new Palindromes();
       // SeparatingDigitsInInteger separate = palindromes.getSeparateNumber().;
       // assertEquals("4 5 2 9 8", separate);
    }
}