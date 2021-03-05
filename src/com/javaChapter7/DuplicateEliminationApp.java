package com.javaChapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateEliminationApp {
    public static void main(String[] args) {
        DuplicateElimination duplicates  = new DuplicateElimination();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Five Number,and Check for Duplicates");
        String userInput = input.nextLine();
        String[] userInputs = userInput.split(",");
        int[] integers = new int[userInputs.length];
        for(int counter=0; counter < userInputs.length; counter++){
            integers[counter]=Integer.parseInt(userInputs[counter]);
        }
      try {
          duplicates.inputMustBeTenToHundred(integers);
          duplicates.inputSizeIsNotMoreThanFive(integers);
          System.out.println(Arrays.toString(duplicates.removeDuplicates(integers)));
      }catch (IllegalArgumentException illegalArgumentException){
          System.err.println("Chibuzor, Can you see what he is doing");
      }

    }
}
