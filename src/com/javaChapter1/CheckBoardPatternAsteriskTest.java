package com.javaChapter1;

import java.util.Scanner;

public class CheckBoardPatternAsteriskTest {
    public static void main(String[] args) {
        CheckBoardPatternAsterisk newPrint = new CheckBoardPatternAsterisk();
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Number to draw an CheckBoard pattern Of Asterisk");
        userInput = input.nextInt();

        newPrint.PrintCheckBoardPattern(userInput);

    }
    



}
