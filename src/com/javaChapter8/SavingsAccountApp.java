package com.javaChapter8;

import java.util.Scanner;

public class SavingsAccountApp {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(0.0);

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate for Monthly Interest for 12 months with annual rate of 4%");
        SavingsAccount.modifyAnnualInterestRate(0.04);
        System.out.println("Enter Your Savings Balance");
        double userInput = input.nextDouble();
        saver1.deposit(userInput);
        saver1.calculateMonthlyInterest();
        System.out.printf("%s%.2f%s%.2f%n","Your Monthly Interest for 12 months with annual rate of ",SavingsAccount.getAnnualInterestRate()
        ," is ", saver1.getSavingsBalance());

        SavingsAccount saver2 = new SavingsAccount(0.0);
        System.out.println("Calculate for Monthly Interest for 12 months with annual rate of 5%");
        SavingsAccount.modifyAnnualInterestRate(0.05);
        System.out.println("Enter Your Savings Balance");
        userInput = input.nextDouble();
        saver2.deposit(userInput);
        saver2.calculateMonthlyInterest();

        System.out.printf("%s%.2f%s%.2f%n","Your Monthly Interest for 12 months with annual rate of ",SavingsAccount.getAnnualInterestRate()
                ," is ", saver2.getSavingsBalance());
    }

}
