package com.javaChapter4;

public class FindTheLargestNumber {
    private  int number;
    private int largest;


    public FindTheLargestNumber(int num) {
        this.number = num;
         this.largest = 0;
    }

    public int getNumber() {
        return  number;
    }
    public void setNumber(int newNumber) {
        this.number = newNumber;
    }
    public void getMaximumNumber() {
        int counter = 0;
        boolean isLargest = number > largest;


    }

    public int getLargestNumber() {
        return largest;
    }
}
