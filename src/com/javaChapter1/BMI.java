package com.javaChapter1;

import javax.swing.*;

public class BMI {
    private double weight;
    private double height;
    private double bmiValue;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmiValue = displayBmiValue();
    }

    public double getWeight() {
        return  weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }else
            {
            JOptionPane.showMessageDialog(null,"Invalid Input For Weight");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
      if(height > 0){
          this.height = height;
      }else{
          JOptionPane.showMessageDialog(null,"Invalid Input For Height");
      }
    }

    public double displayBmiValue() {
        final int BMI_CONSTANT_VALUE = 703;
             bmiValue = (weight * BMI_CONSTANT_VALUE) / (height * height);
        return bmiValue;
    }
    public double getBmiValue() {
        return bmiValue;
    }

    public String checkBMIValueRange() {
        String message = "";
        if (bmiValue < 18.5) {
            message = "Your BMI Value is " + bmiValue + "\nUnderweight : less than " + 18.5;
        }else
            if(bmiValue> 18.5 && bmiValue< 24.9){
                message = "Your BMI Value is " + bmiValue + "\nNormal: between " + 18.5 +" and " + 24.9;

            }else{
                if(bmiValue > 25 && bmiValue < 29.9) {
                    message = "Your BMI Value is " + bmiValue + "\nOverweight: between " + 25 + " and " + 29.9;
                }else{
                        if(bmiValue >= 30){
                            message = "Your BMI Value is " + bmiValue + "\nObese: between " + 30 + " or Greater";
                        }
                    }
                }
        return message;
    }

    public String displayMessage(String message) {

        JOptionPane.showMessageDialog(null, message);
        return message;
    }




}


