package com.javaChapter4;

public class SalaryCalculator {
    private int numOfEmployees;
    private final int basicHourWorked;
    private final int payPerHour;

    public SalaryCalculator(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
        this.basicHourWorked = 40;
        this.payPerHour = 100;

    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public int getBasicHourWorked() {
        return  basicHourWorked;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        if (numOfEmployees < 0){
            System.out.println("invalid number");
        }
        else{
            this.numOfEmployees = numOfEmployees;
        }
    }

    public double basicPayForBasicHours() {
       double basicPay;
        basicPay = basicHourWorked * payPerHour;
    return  basicPay;
    }

    public double calculateExcessHours(double excessHours) {
        double grossPay;
           double excessPay = excessHours - basicHourWorked;
           double check = payPerHour * (excessPay / 2);
           grossPay = basicPayForBasicHours() + check;
        return  grossPay;
    }
}
