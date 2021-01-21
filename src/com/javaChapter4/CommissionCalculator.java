package com.javaChapter4;

import javax.swing.*;

public class CommissionCalculator {

    private double itemValue;
    private int numOfItems;
    private String message;


    public CommissionCalculator(int numOfItems, double itemValue) {
        this.itemValue = itemValue;
        this.numOfItems = numOfItems;
    }

    public double getItemValue() {
        return itemValue;
    }

    public void setItemValue(double newItemValue) {
        this.itemValue = newItemValue;
    }
    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    public double addItems(double newItemValue) {
       this.itemValue = itemValue + newItemValue;
       return  itemValue;
    }

    public void calculateCommission() {
        double commission;
        final int BASIC_SALARY = 200;
        final double COMMISSION_PERCENTAGE = 0.09;
        commission = BASIC_SALARY + (COMMISSION_PERCENTAGE * getItemValue());
        message = "Your Salary for lastWeek is " + commission;
    }

    public String displaySalaryMessage() {
        JOptionPane.showMessageDialog(null,message);
        return  message;
    }
}
