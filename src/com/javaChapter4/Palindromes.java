package com.javaChapter4;

import com.javaChapter1.SeparatingDigitsInInteger;

public class Palindromes extends SeparatingDigitsInInteger {
    public Palindromes(int userInput) {
        super(userInput);
    }

    public Palindromes() {
    }

    public void isAPalindromes() {
        if(getUserInput() > 0) {
            boolean firstIsEqualToFifth = getFifthModulus() == getFirstModulus();
            boolean secondIsEqualToFour = getFourthModulus() == getSecondModulus();
            boolean firstIsNotEqualToFifth = getFifthModulus() != getFirstModulus();
            boolean secondIsNotEqualToFour = getFourthModulus() != getSecondModulus();

            System.out.println(firstIsEqualToFifth);

            if (firstIsEqualToFifth && secondIsEqualToFour) {
                System.out.println("This is a Palindromes");
            } else if (firstIsNotEqualToFifth && secondIsNotEqualToFour) {
                System.out.println("This is not a Palindromes");
            } else {
                System.out.println("Invalid Palindromes");
            }
        }
    }
}
