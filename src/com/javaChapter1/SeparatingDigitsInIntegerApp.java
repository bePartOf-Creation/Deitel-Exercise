package com.javaChapter1;

import java.util.Scanner;

public class SeparatingDigitsInIntegerApp {
    public static void main(String[] args) {
    SeparatingDigitsInInteger separatingDigitsInInteger = new SeparatingDigitsInInteger();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Five digits");
        int fiveDigits = userInput.nextInt();
        separatingDigitsInInteger.separate(fiveDigits);
    }
}
