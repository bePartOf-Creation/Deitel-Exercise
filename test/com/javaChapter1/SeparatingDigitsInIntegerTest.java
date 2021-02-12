package com.javaChapter1;

import com.javaChapter4.Palindromes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatingDigitsInIntegerTest {
    SeparatingDigitsInInteger separatingDigitsInInteger;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void test_ThatOurConstructorWorks(){
        int mod =  SeparatingDigitsInInteger.getFirstModulus();
        int mod1 = SeparatingDigitsInInteger.getSecondModulus();
        int mod2 = SeparatingDigitsInInteger.getThirdModulus();
        int mod3 = SeparatingDigitsInInteger.getFourthModulus();
        int mod4 = SeparatingDigitsInInteger.getFifthModulus();

        assertEquals(0, mod);
        assertEquals(0, mod1);
        assertEquals(0, mod2);
        assertEquals(0, mod3);
        assertEquals(0, mod4);
    }

    @Test
    void test_UserInputs(){
        separatingDigitsInInteger  = new SeparatingDigitsInInteger(0);
        separatingDigitsInInteger.setUserInput(43134);
        int input = separatingDigitsInInteger.getUserInput();
        assertEquals(43134,input);
    }


    @Test
    void  test_ThatTheFIveUserInputCanBeSeparated(){
        separatingDigitsInInteger = new SeparatingDigitsInInteger(0);
        separatingDigitsInInteger.setUserInput(15351);
        separatingDigitsInInteger.separate();
        int mod  = SeparatingDigitsInInteger.getFirstModulus();
        int mod1 = SeparatingDigitsInInteger.getSecondModulus();
        int mod3 = SeparatingDigitsInInteger.getFourthModulus();
        int mod4 = SeparatingDigitsInInteger.getFifthModulus();
        assertEquals(mod4,mod);
        assertEquals(mod3,mod1);




    }
}