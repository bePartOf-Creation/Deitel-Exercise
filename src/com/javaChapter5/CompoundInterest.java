package com.javaChapter5;

public class CompoundInterest {
    private final int rate;
    private double principal;
    private int numberOfYears;
    private double amount;

    public CompoundInterest(double amount, double principal,int year) {
        this.rate = 5;
        this.principal = principal;
        this.amount = amount;
        this.numberOfYears = year;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public int getRate() {
        return rate;
    }
    public double getPrincipal() {
        return principal;
    }
    public double getAmount() {
        return amount;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double calculateCompoundInterest(double newRate) {
        double rate = newRate/100;
        amount = getPrincipal()  *  (Math.pow(1 + rate,getNumberOfYears()) );
        return amount;
    }
}
