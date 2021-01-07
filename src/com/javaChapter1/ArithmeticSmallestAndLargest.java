package com.javaChapter1;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {

        int sum;
        int average;
        int product;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your 1stNumber: ");
        int num1 = userInput.nextInt();

        System.out.println("Enter your 2ndNumber: ");
        int num2 = userInput.nextInt();

        System.out.println("Enter your 3rdNumber: ");
        int num3 = userInput.nextInt();

        System.out.println("Sum is " + (sum = num1 + num2 + num3));
        System.out.println("Average is " + (average = num1 + num2 + num3/3));
        System.out.println("Product is " + (product = num1 * num2 * num3));

       
    }

}

