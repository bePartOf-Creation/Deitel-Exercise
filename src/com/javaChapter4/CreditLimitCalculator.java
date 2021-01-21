package com.javaChapter4;

import javax.swing.*;

public class CreditLimitCalculator {

    private String accountNumber;
    private double balance;
    private int itemCharges;
    private final int creditLimit;
    private int items;
    private int numOfCredits;
    private String message;

    public CreditLimitCalculator(String accountNumber, double initialBalance, int itemCharges,int newItems, int numOfCredits) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.itemCharges = itemCharges;
        this.creditLimit = 100000;
        this.items = newItems;
        this.numOfCredits = numOfCredits;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getItemCharges() {
        return itemCharges;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setBalance(double newInitialBalance) {
        if (newInitialBalance > 0) {
            this.balance = newInitialBalance;
        } else {
            System.out.println("invalid Input");
        }
    }

    public double calculateTotalCredits() {
        int counter = 0;
        double total = 0;
        do {
            double newCredit = Double.parseDouble(JOptionPane.showInputDialog("Enter your new Credit"));
            total += newCredit;
            counter++;
        }
        while (counter < getNumOfCreditsCollected());
    return total;
    }

    public int getItems() {
        return items;
    }

    public int calculateTotalCharges() {
        final int FLAT_CHARGES = 5;
        int totalCharges = 0;

        while (items != 0) {
            totalCharges += FLAT_CHARGES;
            this.itemCharges = totalCharges;
            items--;
        }
        return itemCharges;
    }

    public void checkCreditLimit() {
        if (calculateTotalCredits() > creditLimit) {
            message = "Credit Limit Exceeded";
        } else {
            message = "Credit Limit Not Exceeded";
        }
    }

    public String displayCreditLimit() {
        JOptionPane.showMessageDialog(null, message);
        return  message;
    }

    public double checkNewBalance() {
        double newBalance;
        newBalance = balance + calculateTotalCharges() - calculateTotalCredits();
        return newBalance;
    }

    public int getNumOfCreditsCollected() {
        return numOfCredits;
    }

    public void setNumOfCreditsCollected(int numOfCredits) {
        this.numOfCredits = numOfCredits;
    }

}
