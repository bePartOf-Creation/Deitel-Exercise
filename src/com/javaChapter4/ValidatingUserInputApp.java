package com.javaChapter4;

import java.util.Scanner;

public class ValidatingUserInputApp {
    public static void main(String[] args) {
        ValidatingUserInput valid = new ValidatingUserInput(0,0);
        Scanner input = new Scanner(System.in);
        int counter = 0;

        while(counter < 10){
            System.out.println("Enter (1 for pass), (2 for pass)");
            int userInput = input.nextInt();
            if(valid.passIsEqualTo(userInput)){
                System.out.println();
            }else if(valid.failsIsEqualTo(userInput)){
                System.out.println();
            }
        counter++;
        }
        System.out.println("Total Failure is " + valid.getFails() + ", Total Pass is "+ valid.getPasses());
    }
}
