package com.javaChapter4;

public class TabularOutputApp {
    public static void main(String[] args) {

        int[] arrayOfInput = new int[11];
        int counter;

        System.out.printf("%s%8s%8s%8s%n","N","10*N","100*N","1000*N");
        for(counter= 1; counter < arrayOfInput.length;counter++){
            System.out.printf("%s%8s%8s%8s%n",counter,getInTen(counter),getInHundred(counter),
                    getInThousand(counter));
        }
    }

    public static int getInTen(int counter) {
        return counter * 10;
    }

    public static int getInHundred(int counter) {
        return counter * 100;
    }

    public static int getInThousand(int counter) {
        return  counter * 1000;
    }
}
