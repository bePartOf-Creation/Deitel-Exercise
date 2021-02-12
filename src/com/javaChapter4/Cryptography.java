package com.javaChapter4;

public class Cryptography {

    private static int firstModulus;
    private static int secondModulus;
    private static int fourthModulus;
    private static int thirdModulus;
    private int userInput;


    public Cryptography(int userInput) {
        this.userInput = userInput;
    }
    public static int getFirstModulus() {
        return firstModulus;
    }
    public static int getSecondModulus() {
        return secondModulus;
    }
    public static int getFourthModulus() {
        return  fourthModulus;
    }
    public static int getThirdModulus() {
        return  thirdModulus;
    }
    public int getUserInput() {
        return userInput;
    }
    public void setUserInput(int userInput) {
        final int VALUES = 7;
        if (userInput > 1000 && userInput < 9999){
            this.userInput = userInput + VALUES;
        }else{
            System.out.println("Error");
        }
    }
    public void separate() {
        if(getUserInput() > 0){//1234
            int secondInput = getUserInput() / 10; //123
            firstModulus    = getUserInput() % 10; //4
            int thirdInput  = secondInput / 10; //12
            secondModulus   = secondInput % 10; //3
            int fourthInput = thirdInput / 10;//1
            thirdModulus    = thirdInput % 10;//2
            int fifthInput  = fourthInput / 10;//1
            fourthModulus   = fourthInput % 10;//1
        System.out.printf("%3d%3d%3d%3d%n",secondModulus,fourthModulus,thirdModulus,firstModulus);
        }
    }
}
