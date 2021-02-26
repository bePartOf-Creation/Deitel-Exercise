package com.javaChapter5;

import java.util.Scanner;

public class PythagoreanTriples {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter A Number To Display Pythagorean Triples according to your input");
        int input = userInput.nextInt();
        printPythagoreanTriples(input);
        System.out.println("Thank you for Banking With Us");
    }
    private static void printPythagoreanTriples(int userInput){
        for(int a = 1;a < userInput; a++){
            for(int b= 1; b < userInput; b++){
                for(int c= 1; c < userInput; c++){
                    if(a*a + b*b == c*c){
                        System.out.println(a+" "+b+" "+c);
                    }
                }
            }
        }
    }
}
