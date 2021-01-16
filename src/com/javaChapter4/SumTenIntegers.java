package com.javaChapter4;

import javax.swing.*;

public class SumTenIntegers {
    public int sumIntegersOfTenNumbers() {
        int sum = 0;
        int counter = 1;

        while(counter <= 10){
            sum += counter;
            counter++;
        }
       return sum;
    }

    public String displaySumMessage() {
        String message = "";
          int sum = sumIntegersOfTenNumbers();
          JOptionPane.showMessageDialog(null,"Sum Of Ten Numbers " + sum);
          return  message;
    }
}
