package com.javaChapter4;

import com.javaChapter1.SeparatingDigitsInInteger;

public class Palindromes extends SeparatingDigitsInInteger {

    public Palindromes() { }

    @Override
    public void separate(int userInput) {
        int secondInput = userInput/10; //4529
        int modOne = userInput % 10; //8
        int thirdInput = secondInput/10; //452
        int modTwo = secondInput % 10; //9
        int fourthInput = thirdInput/10;//45
        int modThree = thirdInput % 10;//2
        int fifthInput =  fourthInput/10;//4
        int modFour =  fourthInput % 10;//5
        int sixthInput = fifthInput /10;//0.4
        int modFive = fifthInput  % 10;// 4

        boolean firstIsEqualToFifth = modFive == modOne;
        boolean secondIsEqualToFour =  modFour == modTwo;
        if(firstIsEqualToFifth && secondIsEqualToFour){
            System.out.printf("%3d%3d%3d%3d%3d%3s", modFive,modFour,modThree,modTwo,modOne, " is A Palindromes");
        }
        else{
            System.out.println("This is not a Palindromes");
         }
        }


}
