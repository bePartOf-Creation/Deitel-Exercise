package com.javaChapter4;

import java.util.Scanner;

public class larger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int largest = 0;
        int secondLargest = 0;

        while(counter <= 10){

            System.out.println("Enter number ");
            int getNum = scanner.nextInt();
            if (getNum > largest){
                largest = getNum;
            }

            if (getNum < largest && getNum > secondLargest){
                secondLargest = getNum;
            }
            counter++;
        }
        System.out.println("largest = " + largest);
        System.out.println("second largest = " + secondLargest);
    }
}
