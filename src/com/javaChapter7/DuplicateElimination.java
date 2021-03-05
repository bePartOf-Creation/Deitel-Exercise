package com.javaChapter7;

public class DuplicateElimination {
    public int[] removeDuplicates(int[] inputs) {
           int[] userInput = new int[inputs.length];
           userInput[0] = inputs[0];

           for(int i =1; i < inputs.length; i++){
               for(int j = 0; j < userInput.length; j++){
                   if(inputs[i] == userInput[j]){
                       break;
                   }

                   if(!(inputs[i] == userInput[j])
                   &&(userInput[j] == 0)){
                       userInput[j] = inputs[i];
                       break;
                   }
               }
           }
        return userInput;
    }

    public void inputMustBeTenToHundred(int[] userInput) {
        for (int j : userInput) {
            if (j < 10 || j > 100) {
                throw new IllegalArgumentException("Please Enter Input From 10 t0 100 only");
            }
        }
    }

    public void inputSizeIsNotMoreThanFive(int[] inputs) {
        if(inputs.length  > 5 || inputs.length < 1){
            throw new IllegalArgumentException("Please enter Five Number Only");
        }
    }
}
