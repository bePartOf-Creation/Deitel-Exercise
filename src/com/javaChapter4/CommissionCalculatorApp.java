package com.javaChapter4;

import javax.swing.*;

public class CommissionCalculatorApp {
    public static void main(String[] args) {
        CommissionCalculator commission = new CommissionCalculator(0,0.0);
        int num = 0;
        int counter = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Numbers of Items Sold by you"));
        commission.setNumOfItems(num);
        while(counter < commission.getNumOfItems()){
          double newItemsValue = Double.parseDouble(JOptionPane.showInputDialog(null,"Add a new items"));
          commission.addItems(newItemsValue);
          counter++;
      }
        commission.calculateCommission();
        commission.displaySalaryMessage();
    }


}
