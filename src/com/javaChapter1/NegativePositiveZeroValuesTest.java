package com.javaChapter1;

import java.util.Scanner;

public class NegativePositiveZeroValuesTest {
    public static void main(String[] args) {
        NegativePositiveZeroValues printValues = new NegativePositiveZeroValues();
        Scanner userInput = new Scanner(System.in);
        System.out.println("input five Digits");
        System.out.println("Enter your Ist Number");
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        if(userInput.hasNextInt()) {
             num1 = userInput.nextInt();
        }
            System.out.println("Enter your 2nd Number");
        if(userInput.hasNextInt()) {
             num2 = userInput.nextInt();
        }
            System.out.println("Enter your 3rd Number");
        if(userInput.hasNextInt()) {
            num3 = userInput.nextInt();
        }
            System.out.println("Enter your 4th Number");
        if(userInput.hasNextInt()) {
             num4 = userInput.nextInt();
        }
            System.out.println("Enter your 5th Number");
        if(userInput.hasNextInt()) {
            num5 = userInput.nextInt();
        }
        else {
            System.out.println("Your Input is Invalid");
        }
            printValues.printPositiveNumbers(num1,num2,num3,num4,num5);
            printValues.printNegativeNumbers(num1,num2,num3,num4,num5);
            printValues.printZeroNumbers(num1,num2,num3,num4,num5); }

    }

