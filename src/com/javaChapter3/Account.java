package com.javaChapter3;

import javax.swing.*;

public class Account {
    private String accountName;
    private double accountBalance;
    private int pin;

    public Account(String accountName, double balance, int pin) {
        this.accountName = accountName;
        this.accountBalance = balance;
        this.pin = pin;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String newAccountName) {
        this.accountName = newAccountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance = accountBalance;
        } else {
            JOptionPane.showMessageDialog(null, "Your Account Must not Be In Debt");
        }
    }

    public int getPin() {
        return pin;
    }

    public boolean confirmPin(int givenPin) {
        if (pin == givenPin) {
            return true;
        } else {
            return false;
        }
    }

    public void changePin(int oldPin, int newPin){
        if(confirmPin(oldPin)){
            pin = newPin;
        } else {
            JOptionPane.showMessageDialog(null,"Invalid Input");
        }
    }


    public void depositMoney(double amount) {
       if(amount > 0) {
           this.accountBalance = accountBalance + amount;
       }else{
           JOptionPane.showMessageDialog(null, "Deposit The Right Amount");
       }

    }

    public void withdrawMoney(double amount) {
       if(amount < accountBalance) {
           this.accountBalance = accountBalance - amount;
       }else{
           if(amount > accountBalance){
               JOptionPane.showMessageDialog(null,"Withdrawn Amount Exceeded");
           }
//           else{
//               JOptionPane.showMessageDialog(null,"Input a Valid Input");
//           }

       }

    }
}
