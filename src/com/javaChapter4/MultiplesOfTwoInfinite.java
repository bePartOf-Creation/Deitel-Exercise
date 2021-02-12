package com.javaChapter4;

public class MultiplesOfTwoInfinite {
    public static void main(String[] args) {
        int count = 0;
        int multiplesOfTwo = 1;

        while(true){
            multiplesOfTwo *= 2;
            System.out.println(multiplesOfTwo);
          count++;
        }
    }
}
