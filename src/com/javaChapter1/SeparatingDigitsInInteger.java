package com.javaChapter1;

public class SeparatingDigitsInInteger {

    public SeparatingDigitsInInteger(){ }

    public int separate(int userInput) {
        System.out.println("Enter Five Digits Only");
        boolean isNumValid = userInput > 0;
          if(isNumValid){
              int input2 = userInput/10; //4529
                int mod1 = userInput % 10; //8
            int input3 = input2/10; //452
                int mod2 = input2 % 10; //9
            int input4 = input3/10;//45
                int mod3 = input3 % 10;//2
            int input5 = input4/10;//4
                int mod4 = input4 % 10;//5
            int input6 = input5/10;//0.4
                int mod5 = input5 % 10;// 4

            System.out.printf("%3d%3d%3d%3d%3d", mod5,mod4,mod3,mod2,mod1);

        }else{
            System.out.println("Your Input is Invalid");
        }
          return 0;
    }
}
