package com.javaChapter1;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your 1stNumber: ");
        int num1 = userInput.nextInt();

        System.out.println("Enter your 2ndNumber: ");
        int num2 = userInput.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is the largest Number");
        }
        if(num1 < num2){
            System.out.println(num2 + " is the largest Number");
        }
        if(num1 == num2){
            System.out.println("These numbers are Equal");
        }
    }
}
