package com.javaChapter5;

import java.util.Scanner;

public class CompoundInterestApp {
    public static void main(String[] args) {
        CompoundInterest interest = new CompoundInterest(0.0,0.0,0);
        Scanner input = new  Scanner(System.in);

        System.out.println("To Calculate the Compound Interest at Different rate.\nEnter your principal and the number of years");
        System.out.println("Enter your principal amount");
        double amount = input.nextDouble();
        interest.setPrincipal(amount);
        System.out.println("Enter your number of Years");
        int years = input.nextInt();
        interest.setNumberOfYears(years);
        int year = interest.getNumberOfYears();
        int rate = interest.getRate();

        System.out.printf("%2s%18s%n","Years On Investment","Interest Amount");
        for(rate = 5;rate < 11; rate++){
            interest.calculateCompoundInterest(rate);
            year++;
            System.out.printf("%4d%,22.2f%n",year,interest.getAmount());

        }
    }
}
