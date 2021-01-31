package com.javaChapter1;


public class SeparatingDigitsInInteger {

    private static int firstModulus;
    private static int secondModulus;
    private static int thirdModulus;
    private static int fourthModulus;
    private static int fifthModulus;
    private int userInput;

    public SeparatingDigitsInInteger(int userInput) {
        this.userInput = userInput;
    }
    public SeparatingDigitsInInteger(){ }
    public void separate() {
        int secondInput =  getUserInput()/10; //4529
         firstModulus = getUserInput() % 10; //8
        int thirdInput = secondInput/10; //452
         secondModulus = secondInput % 10; //9
        int fourthInput = thirdInput/10;//45
         thirdModulus = thirdInput % 10;//2
        int fifthInput =  fourthInput/10;//4
         fourthModulus =  fourthInput % 10;//5
        int sixthInput = fifthInput /10;//0.4
         fifthModulus = fifthInput  % 10;// 4

        System.out.printf("%3d%3d%3d%3d%3d%n", fifthModulus,fourthModulus,thirdModulus,secondModulus,firstModulus);
    }

    public static int getFirstModulus() {
        return firstModulus;
    }
    public static int getSecondModulus() {
        return secondModulus;
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


    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }
    public int getUserInput() {
        return  userInput;
    }

}
