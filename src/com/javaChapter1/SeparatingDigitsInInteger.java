package com.javaChapter1;

public class SeparatingDigitsInInteger {

    public SeparatingDigitsInInteger(){ }

    public int separate(int userInput) {
        System.out.println("Enter Five Digits Only");
        boolean numIsValid = userInput > 0;
          if(numIsValid){
              int secondInput = userInput/10; //4529
                int modOne = userInput % 10; //8
            int thirdInput = secondInput/10; //452
                int modTwo = secondInput % 10; //9
            int fourthInput = thirdInput/10;//45
                int modThree = thirdInput % 10;//2
            int fifthInput =  fourthInput/10;//4
                int modFour =  fourthInput % 10;//5
            int sixthInput = fifthInput /10;//0.4
                int modFive =fifthInput  % 10;// 4

            System.out.printf("%3d%3d%3d%3d%3d", modFive,modFour,modThree,modTwo,modOne);

        }else{
            System.out.println("Your Input is Invalid");
        }
          return 0;
    }
}
