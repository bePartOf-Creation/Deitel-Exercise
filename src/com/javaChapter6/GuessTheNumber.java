package com.javaChapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner userInput = new Scanner(System.in);
        int yourValue;
        double desiredValue;
        //int num;

        for (desiredValue = 0; desiredValue < 11; desiredValue++) {
            yourValue = 1 + random.nextInt(10);
            System.out.println(yourValue);

            System.out.println("Guess the Number from 1 - 10");
            desiredValue = userInput.nextDouble();

            if (desiredValue == yourValue) {
                System.out.println("Yes " + yourValue + "is the your Value. YOU WON!!!!");
            }
            if (desiredValue > yourValue) {
                System.out.println("Too High. Try Again");
            }
            if (desiredValue < yourValue) {
                System.out.println("Too low. Try Again");
            }
        }
    }
}
