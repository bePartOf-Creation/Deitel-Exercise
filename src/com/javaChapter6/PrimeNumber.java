package com.javaChapter6;

import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isAPrimeNumber(1,10000));

    }
    public static ArrayList<Integer> isAPrimeNumber(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean prime = true;
        for(int userInput = start; userInput < end; userInput++){
            int count = 2;
            while(count < userInput/2){
                if(userInput % count == 0){
                    prime = false;
                    break;
                }
                count++;
            }
            if(prime){
                primes.add(userInput);
            }
        }
        return primes;
    }



    public static  boolean  validateUserInput(int userInput) {
        return userInput > 1;
    }
}
