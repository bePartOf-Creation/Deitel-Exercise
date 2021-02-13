package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {
    Cryptography cryptography;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

@Test
    void testThat_OurApplicationHasADefaultValue() {
        cryptography = new Cryptography(1, 2, 3, 4);
        cryptography.setEncryptValue(7);
        cryptography.setModValue(10);
        assertEquals(7, cryptography.getEncryptValue());
        assertEquals(10, cryptography.getModValue());
    }

@Test
    void testThat_UserInputFirstDigitsIntegers() {
        cryptography = new Cryptography(1, 2, 3, 4);
        cryptography.setFirstModulus(2);
        int digits = cryptography.getFirstModulus();
        assertEquals(9, digits);
    }

@Test
    void testThat_OurInputSecondDigitsIntegers() {
        cryptography = new Cryptography(1, 2, 3, 4);
        cryptography.setSecondModulus(4);
        int digits = cryptography.getSecondModulus();
        assertEquals(1, digits);
    }

@Test
    void testThat_OurInputThirdDigitsIntegers() {
        cryptography = new Cryptography(1, 2, 3, 4);
        cryptography.setThirdModulus(3);
        int digits = cryptography.getThirdModulus();
        assertEquals(0, digits);
    }

@Test
    void testThat_OurInputFourthDigitsIntegers() {
        cryptography = new Cryptography(1, 2, 3, 4);
        cryptography.setFourthModulus(6);
        int digits = cryptography.getFourthModulus();
        assertEquals(3, digits);
    }
@Test
    void testThat_AllFourDigitsCanBeEncrypted() {
        cryptography = new Cryptography(1, 2, 3, 4);
        cryptography.setFirstModulus(4);
        cryptography.setSecondModulus(4);
        cryptography.setThirdModulus(3);
        cryptography.setFourthModulus(6);
        String encrypt = cryptography.encryptUserInput();
        assertEquals("0131", encrypt);
    }

@Test
    void testThat_theEncryptedValueIsDecryptedBackToOriginalNUmber() {
        cryptography = new Cryptography(1, 2, 3, 4);
        cryptography.setFirstModulus(4);
        cryptography.setSecondModulus(4);
        cryptography.setThirdModulus(3);
        cryptography.setFourthModulus(6);
        cryptography.decryptUserInput();
        assertEquals(4, cryptography.getFirstModulus());
        assertEquals(4, cryptography.getSecondModulus());
        assertEquals(3, cryptography.getThirdModulus());
        assertEquals(6, cryptography.getFourthModulus());
    }

@Test
    void display_DecryptedValue() {
        cryptography = new Cryptography(1, 2, 3, 4);
        cryptography.setFirstModulus(4);
        cryptography.setSecondModulus(10);
        cryptography.setThirdModulus(3);
        cryptography.setFourthModulus(6);
        cryptography.decryptUserInput();
        String encrypt = cryptography.displayDecryptedValue();
        assertEquals("41036", encrypt);
    }@Test
    void testThatUserInputFourDigitNumber(){
        cryptography = new Cryptography(1234);
        cryptography.setUserInput(2345);
        int input = cryptography.getUserInput();
        assertEquals(2345,input);
    }
    @Test
    void test_ThatUserInputCanBeSeparated(){
        cryptography = new Cryptography(1234);
        cryptography.setUserInput(4436);
        cryptography.separate();
        int mod  = cryptography.getFirstModulus();
        int mod1 = cryptography.getSecondModulus();
        int mod3 = cryptography.getThirdModulus();
        int mod4 = cryptography.getFourthModulus();
        assertEquals(4, mod4);
        assertEquals(4,mod3);
        assertEquals(3,mod1);
        assertEquals(6,mod);

    }
}