package com.javaChapter1;

import javax.swing.*;

public class BMIAppTest {
    public static void main(String[] args) {
        BMI newBMI = new BMI(72.0,6.5);
        double weight = 0;
        double height;

        weight = Double.parseDouble(JOptionPane.showInputDialog("input your weight"));
        newBMI.setWeight(weight);
        height = Double.parseDouble(JOptionPane.showInputDialog("input your height"));
        newBMI.setHeight(height);
        if(weight < 0){
            if(height < 0){
                JOptionPane.showMessageDialog(null,"Wrong Inputs.Cannot Calculate BMI VALUE");
            }
        }else {
            newBMI.displayBmiValue();
            newBMI.displayMessage(newBMI.checkBMIValueRange());
        }
    }
}
