package com.javaChapter2;

import java.security.SecureRandom;

public class CheckRandom {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        for(int counter= 1; counter <= 4; counter++){

            int face = 1 + random.nextInt(3);
            System.out.printf("%d  ", face);

            if(face % 5 == 0){
                System.out.println();
            }
        }
    }
}
