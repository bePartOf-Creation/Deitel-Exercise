package com.javaChapter5;

import java.util.Scanner;

public class smallestValueApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int smallValue = Integer.MAX_VALUE;

        System.out.println("Enter limit to loop: ");
        int limit = scanner.nextInt();

        while (counter < limit) {
            System.out.println("enter next value: ");
            int nextValue = scanner.nextInt();
            if (nextValue < smallValue) {
                smallValue = nextValue;
            }
            counter++;
        }
        System.out.println("smallest value is " + smallValue);
    }



}
