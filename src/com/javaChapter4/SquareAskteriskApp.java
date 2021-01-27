package com.javaChapter4;

import java.util.Scanner;

public class SquareAskteriskApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A number to Print A Square");
        int num = input.nextInt();
        SquareAsterisks.printSquareShape(num);
    }

}
