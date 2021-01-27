package com.javaChapter4;

public class SquareAsterisks {

    private static int mainCount;
    private static int counter;

    public static String printSquareShape(int input) {
        int count = input - 1;
        for (mainCount = 0; mainCount < input; mainCount++) {
            for (counter = 0; counter < input; counter++) {
                if (mainCount == 0 || counter == 0 || mainCount == count || counter == count) {
                    System.out.print("   *");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        return "*";
    }
}