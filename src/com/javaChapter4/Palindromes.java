package com.javaChapter4;

import com.javaChapter1.SeparatingDigitsInInteger;

public class Palindromes extends SeparatingDigitsInInteger {

    private static int firstModulus;
    private static int secondModulus;
    private static int thirdModulus;
    private static int fourthModulus;
    private static int fifthModulus;

    public Palindromes() {
    }

    @Override
    public void separate(int userInput) {
        int secondInput = userInput/10; //4529
        int firstModulus = userInput % 10; //8
        int thirdInput = secondInput/10; //452
        int secondModulus = secondInput % 10; //9
        int fourthInput = thirdInput/10;//45
        int thirdModulus = thirdInput % 10;//2
        int fifthInput =  fourthInput/10;//4
        int fourthModulus =  fourthInput % 10;//5
        int sixthInput = fifthInput /10;//0.4
        int fifthModulus = fifthInput  % 10;// 4

        System.out.printf("%3d%3d%3d%3d%3d", fifthModulus,fourthModulus,thirdModulus,secondModulus,firstModulus);
            this.firstModulus =  firstModulus;
            this.secondModulus = secondModulus;
            this.thirdModulus =  thirdModulus;
            this.fourthModulus = fourthModulus;
            this.fifthModulus =  fifthModulus;
    }

    public static int getFirstModulus() {
        return firstModulus;
    }

    public static int getSecondModulus() {
        return  secondModulus;
    }

    public static int getThirdModulus() {
        return thirdModulus;
    }

    public static int getFourthModulus() {
        return fourthModulus;
    }

    public static int getFifthModulus() {
        return fifthModulus;
    }

    public void isAPalindromes() {
        boolean firstIsEqualToFifth = getFifthModulus() == getFirstModulus();
        boolean secondIsEqualToFour = getFourthModulus() == getSecondModulus();
        if(firstIsEqualToFifth && secondIsEqualToFour) {
            System.out.println("This is a Palindromes");
        }
       else{
           System.out.print("This is not a Palindromes");
        }
    }
}
