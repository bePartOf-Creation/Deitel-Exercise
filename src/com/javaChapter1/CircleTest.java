package com.javaChapter1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Circle newCalc = new Circle();
         System.out.println("Enter your radius Value");
         if(userInput.hasNextDouble()){
             double radius = userInput.nextDouble();

             newCalc.diameterOfACircle(radius);
             newCalc.areaOfACircle(radius);
             newCalc.circumferenceOfACircle(radius);
         }
         else{
             System.out.println("Your Input IS INVALID");
         }
    }
}
