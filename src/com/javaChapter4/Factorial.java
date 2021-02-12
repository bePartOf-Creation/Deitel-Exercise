package com.javaChapter4;

public class Factorial {

    private int inputNumber;
    private int factorial;

    public Factorial(int inputNumber) {
        this.inputNumber = inputNumber;
        this.factorial = 1;
    }

    public double getInputNumber() {
        return inputNumber;
    }
    public void setInputNumber(int inputNumber) {
        boolean inputNumberIsValid = inputNumber > 0;
        if(inputNumberIsValid){
            this.inputNumber = inputNumber;
        }else {
            System.out.println("invalid input");
        }
    }

    public void calculateFactorial() {
        int counter = 1;
        while (counter <= getInputNumber()){
            factorial = factorial * counter;
            counter++;
        }
        this.inputNumber = factorial;
    }


    public String getMessage() {
        String message = "";
         message = "The Factorial of your input "+" is " + getInputNumber();
      return message;
    }
}
