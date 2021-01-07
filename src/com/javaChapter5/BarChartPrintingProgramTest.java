package com.javaChapter5;

import java.util.Scanner;

public class BarChartPrintingProgramTest {

    public static void main(String[] args) {

        BarChartPrintingProgram newPrint = new BarChartPrintingProgram();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 30 that display its number of asterisks");
        if (input.hasNextInt()) {
            int number1 = input.nextInt();
            System.out.println("Enter 2nd Number");
            int number2 = input.nextInt();
            System.out.println("Enter 3rd Number");
            int number3 = input.nextInt();
            System.out.println("Enter 4th Number");
            int number4 = input.nextInt();
            System.out.println("Enter 5th Number");
            int number5 = input.nextInt();

            newPrint.printItOut(number1);
            newPrint.printItOut(number2);
            newPrint.printItOut(number3);
            newPrint.printItOut(number4);
            newPrint.printItOut(number5);

        } else {
            System.out.println("Invalid value");
        }


    }
}