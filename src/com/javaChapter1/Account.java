package com.myFirstTest.tdd;

public class Account {

    private int accountBalance;
    private int pin;

    public Account(int accountBalance,int pin){
        this.accountBalance = accountBalance;
        this.pin = pin;
    }

    public void depositMoney(int amount) {
      if(amount >= 0){
          accountBalance = accountBalance + amount;
        }
      }

    public int getAccountBalance() {
       return accountBalance;
    }

    public void withdrawMoney(int newWithdrawal) {
        accountBalance = accountBalance - newWithdrawal;
    }

    public void setPin(int oldPin, int newPIn) {
       if(pin == oldPin){
           this.pin = newPIn;
       }
       else{
           System.out.println("Invalid Pin");
       }
    }

    public int getPin() {
        return pin;
    }
}
