package com.javaChapter5;

public class ProductOddIntegers {
    public int multiplyOddIntegers() {
        int product = 1;
        int counter = 1;

        while (counter <= 15) {
            product *= counter;
            counter += 2;
        }
        return product;
    }
}
