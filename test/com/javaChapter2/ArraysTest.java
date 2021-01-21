package com.javaChapter2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testArrays(){
        int[] studentScores; // Declaring an Array.
        int[] testScores = new int[4]; //instantiating
        int[] scores = {25,3,12,21,19};// variables storing the elements


        testScores[0] = 17;
        testScores[1] = 25;
        testScores[2] = 7;
        testScores[3] = 23;

        String[]names = {"Tape","Usher","Tobi"};
        System.out.println("Implementing for loops");
        for(int i = 0; i < names.length; i++){
            System.out.println("Name at index " + i + names[i]);
        }
      //Using wile loop
        System.out.println();
        System.out.println("Implementing for loops");
        int counter = 0;
        while(counter < names.length){
            System.out.println("Name at index " + counter +names[counter]);
            counter++;
        }
    }

    @Test
    void testMultidimensionalArray() {
        int[][] grades = new int[3][4];

        int[][] scores = {
                {70, 89, 98, 93},
                {57, 49, 82, 90},
                {75, 34, 99, 45},
        };

        System.out.println("Score at this position is " + scores[0][1]);
        System.out.println("Score at this position is " + (scores[0][1] = 95));
        System.out.println();

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
                System.out.print(scores[row][col]);
                System.out.print(" ");

            }
            System.out.println();


        }
        int[] f = {2, 3, 4, 5, 6, 7, 9};

        System.out.println(f[4]);

        double total = 0;
        float[] c = new float[100];
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
            total += c[i];
        }
    }
    int [][] t = new int[2][3];

    @Test
    void testThatSalesCommissions(){

    }
}