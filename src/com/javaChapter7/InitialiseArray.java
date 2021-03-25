package com.javaChapter7;

import java.util.Arrays;

public class InitialiseArray {
    public static void main(String[] args) {
        final int ARRAY_OF_ELEMENTS = 15;
        int[] array = new int[ARRAY_OF_ELEMENTS];

        int[] newArray = initializeArray(array);
        System.out.println(Arrays.toString(newArray));


    }
    public static int[] initializeArray(int[] array){
        for (int  i: array) {
            array[i] = 0;
        }
        return array;
    }
}
