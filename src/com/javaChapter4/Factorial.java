package com.javaChapter4;

public class Factorial {

    private int inputNumber;
    private int factorial;

    public Factorial(int inputNumber) {
        this.inputNumber = inputNumber;
        this.factorial = 1;
    }

    public void setInputNumber(int inputNumber) {
        boolean inputNumberIsValid = inputNumber > 0;
        if(inputNumberIsValid){
          this.inputNumber = inputNumber;
        }else {
            System.out.println("invalid input");
        }

    }

    public int getInputNumber() {
        return inputNumber;
    }

    public int calculateFactorial() {
        int counter = 1;
        System.out.println(getInputNumber());
        while (counter < inputNumber){
            factorial = factorial * counter;
            counter++;
        }
        return  factorial;
    }

    public String getMessage() {
        String message = "";
         message = "The Factorial of your input "+" is " + factorial;
      return message;
    }
}
