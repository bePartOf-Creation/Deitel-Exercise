package com.javaChapter4;

import java.util.Scanner;

public class PalindromesApp {
    public static void main(String[] args) {
        Palindromes palindromes = new Palindromes();

        System.out.println("Enter Five Numbers");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        palindromes.separate(input);
        palindromes.isAPalindromes();
    }
}


