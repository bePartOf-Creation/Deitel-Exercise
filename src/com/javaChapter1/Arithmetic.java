package com.javaChapter1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int sum;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your 1stNumber: ");
        int num1 = userInput.nextInt();

        System.out.println("Enter your 2ndNumber: ");
        int num2 = userInput.nextInt();

        System.out.println("Sum is " + (sum = num1 +num2));
        System.out.println("Sum is " + (sum = num1 *num2));
        System.out.println("Sum is " + (sum = num1 -num2));
        System.out.println("Sum is " + (sum = num1 /num2));
    }
}
