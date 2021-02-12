package com.javaChapter4;

import com.javaChapter1.SeparatingDigitsInInteger;
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
    void testThat_OurInputFourDigitsIntegers(){
        cryptography = new Cryptography(1234);
        int digits = cryptography.getUserInput();
        assertEquals(1234,digits);
}
@Test
    void testThat_UserInputDoesNotExceedFour_DigitsInteger(){
        cryptography = new Cryptography(1234);
        cryptography.setUserInput(12345);
        assertEquals(1241, cryptography.getUserInput());
}
@Test
    void testToPerformModulusOperationOnTheUserInputResults(){
        cryptography = new Cryptography(1234);
        cryptography.setUserInput(15351);
        cryptography.separate();
        int mod  = Cryptography.getFirstModulus();
        int mod1 = Cryptography.getSecondModulus();
        int mod3 = Cryptography.getFourthModulus();
        int mod4 = Cryptography.getThirdModulus();
        assertEquals(mod4,mod);
        assertEquals(mod1,mod3);

}
}