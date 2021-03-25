package com.javaChapter7;


import java.util.Arrays;

public class SumIn2dArray {
    public static void main(String[] args) {
        int[][] array2D = {{1,2,3},{4,5}};

        int[] array = {12,34,45,67,8,9,0,3,4,12,45,8,34,56,67,2,3,6,99,12};


        System.out.println(Arrays.toString(transfer11thElementToAnewArray(array)));
        int sum = sumOf2DArray(array2D);
        System.out.println(sum);
    }
    public static int sumOf2DArray(int[][] array){
        int sum = 0;
        int i =0;
        while(i < array.length){
            for(int j= 0; j< array[i].length;j++){
                sum += array[i][j];
            }
            i++;
        }
        return  sum;
    }
    public static int[] transfer11thElementToAnewArray(int[] array){
        int[] b = {array.length};
        for(int i : array){
            if(i == 11){
                b[0] = array[i];
            }
        }
        return b;
    }
}
