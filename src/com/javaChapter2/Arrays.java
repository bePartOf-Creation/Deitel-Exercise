package com.javaChapter2;

public class Arrays {
    public static void main(String[] args) {
     int counter;
        //int[] input = new int[12];//0R
        int[] input = {2,3,4,5,6,7,8,91,0,1};
        System.out.printf("%s%8s%n", "Index", "Values");
        for(counter = 0; counter < input.length;counter++){
            System.out.printf("%d%7d%n", counter,input[counter]);
        }
    }
}
