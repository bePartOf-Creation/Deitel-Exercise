package com.javaChapter8;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;


    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;

    }
    public static void modifyAnnualInterestRate(double newRate) {
       annualInterestRate = newRate;
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void deposit(double newSavingsBalance) {
        this.savingsBalance = savingsBalance + newSavingsBalance;
    }
    public double getSavingsBalance() {
        return  savingsBalance;
    }
    public void calculateMonthlyInterest() {
        this.savingsBalance= (getSavingsBalance() * annualInterestRate/12) + getSavingsBalance();
    }





}
