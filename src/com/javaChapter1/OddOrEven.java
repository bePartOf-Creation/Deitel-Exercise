package com.javaChapter1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
                int x;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter your 1st integer");
                 if(input.hasNextInt()){
                     x = input.nextInt();
                     if(x % 2 == 0){
                         System.out.printf("%d is an even number", x);
                     }
                     if(x % 2 == 1){
                         System.out.printf("%d is an odd number", x);
                     }
                 }else{
                     System.out.println("Your Input Is Invalid");
                 }


            }
        }


