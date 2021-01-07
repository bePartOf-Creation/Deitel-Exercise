package com.javaChapter3;

import javax.swing.*;

public class AccountAppTest {
    public static void main(String[] args) {
        Account newAccount = new Account("Ola",0,1105);
        double amount;
      /* ---------------Ola is about to deposit some Ca66 sh---------------------------------- */
        amount = Double.parseDouble(JOptionPane.showInputDialog("How U wan Deposit?"));
        newAccount.depositMoney(amount);
        JOptionPane.showMessageDialog(null, "Hi, " + newAccount.getAccountName() + " you Have been Credited with " + newAccount.getAccountBalance());

        /* ---------------Ola is about to withdraw && OverWithdraw from his deposited Cash------------------ */
        JOptionPane.showMessageDialog(null,"Hi," + newAccount.getAccountName() + " How U wan Withdraw?");
        int pin = Integer.parseInt(JOptionPane.showInputDialog("Hi, " + newAccount.getAccountName() + " Input Pin"));
           if(newAccount.confirmPin(pin)){
               amount = Double.parseDouble(JOptionPane.showInputDialog("Hi," + newAccount.getAccountName() + " Input Withdraw amount?"));
               newAccount.withdrawMoney(amount);
               JOptionPane.showMessageDialog(null, "Hi, " + newAccount.getAccountName() + " you are left with " + newAccount.getAccountBalance());
           } else{
               JOptionPane.showMessageDialog(null,"Invalid Pin.");
           }







    }


}
