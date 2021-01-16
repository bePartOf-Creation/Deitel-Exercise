package com.javaChapter2;

public class Loops {
    public static void main(String[] args) {

//        int num = 10;
////        while(num > 0){
////            System.out.println(num);
////            num--;
////        }
//
//        for(num=1; num <11; num++){
//            System.out.println(num);
//        }


//                int counter = 0;
//
//                for (int j = 10; j > 0; --j) {
//                    ++counter;
//                    System.out.println(j);
//                }
        int x = 2;
        int y = 20;
        int counter = 0;

        for (int j = 0; j < 100; j += (y / x)) {
            counter++;
            System.out.println(j);
        }
            }
        }


