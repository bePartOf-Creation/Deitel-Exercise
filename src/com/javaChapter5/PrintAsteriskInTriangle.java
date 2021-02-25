package com.javaChapter5;

import java.util.Scanner;

public class PrintAsteriskInTriangle {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter A Number To print a Triangle according to your input");
        int input = userInput.nextInt();
        printTriangle(input);
        System.out.println("Thank you for Banking With Us");

        System.out.println("Enter A Number To print a Reverse-Triangle according to your input");
        input = userInput.nextInt();
        printReverseTriangle(input);
        System.out.println("Thank you for Banking With Us");

    }
    public static void printTriangle(int userInput){
        for(int i = 0; i < userInput;i++){
            for(int j = 0; j < i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void printReverseTriangle(int userInput){
        for(int i = userInput; i > 1;i--){
            for(int j = 0; j < i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
