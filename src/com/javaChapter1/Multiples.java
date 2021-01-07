package com.javaChapter1;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        if (userInput.hasNextInt()) {
            int a = userInput.nextInt();
            System.out.println("Enter 2nd Number");
            int b = userInput.nextInt();
                if(a % b == 0){
                    System.out.printf("%d is a multiple of %d",a, b);
                }
                if(a % b == 1){
                    System.out.printf("%d is not a multiple of %d",a, b);
                }else {
                    System.out.println(a + " is not a multiples of " + b);
                }
        }else{
            System.out.println("Your input is Invalid");
        }
    }
}
