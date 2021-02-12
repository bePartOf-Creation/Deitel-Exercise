package com.javaChapter4;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Factorial factorial = new Factorial(0);
        System.out.println("Enter a Number");
        int userInput = input.nextInt();
        factorial.setInputNumber(userInput);
        factorial.calculateFactorial();
        System.out.println(factorial.getMessage());
    }
}
