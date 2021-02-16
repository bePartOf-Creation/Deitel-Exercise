package com.javaChapter5;

public class SumOfOddIntegers {
    public int addOddIntegers() {
        int sum = 0;
        int counter = 1;

        while (counter <= 99) {
            sum += counter;
            counter += 2;
        }
        return sum;
    }
}
