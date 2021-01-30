package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {
    Palindromes palindromes;
    @BeforeEach
    void setUp() {
        palindromes = new Palindromes();
    }

    @AfterEach
    void tearDown() {
    }

@Test
    void test_ThatOurConstructorWorks(){
       palindromes = new Palindromes();
       int mod = Palindromes.getFirstModulus();
       int mod1 = Palindromes.getSecondModulus();
       int mod2 = Palindromes.getThirdModulus();
       int mod3 = Palindromes.getFourthModulus();
       int mod4 = Palindromes.getFifthModulus();

        assertEquals(0, mod);
        assertEquals(0, mod1);
        assertEquals(0, mod2);
        assertEquals(0, mod3);
        assertEquals(0, mod4);
}
@Test
    void  test_ThatTheFIveUserInputIsAPalindromes(){
        palindromes = new Palindromes();
        palindromes.isAPalindromes();
        palindromes.separate(15351);
        int mod =  Palindromes.getFirstModulus();
        int mod1 = Palindromes.getSecondModulus();
        int mod3 = Palindromes.getFourthModulus();
        int mod4 = Palindromes.getFifthModulus();
        assertEquals(mod4,mod);
        assertEquals(mod3,mod1);

         palindromes.isAPalindromes();
         palindromes.separate(23468);
         mod =  Palindromes.getFirstModulus();
         mod1 = Palindromes.getSecondModulus();
          assertEquals(mod1,mod);
         mod3 = Palindromes.getFourthModulus();
         mod4 = Palindromes.getFifthModulus();
         assertEquals(mod3,mod4);

}
}