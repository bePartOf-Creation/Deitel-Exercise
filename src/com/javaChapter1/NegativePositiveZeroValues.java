package com.javaChapter1;

public class NegativePositiveZeroValues {

    public void printPositiveNumbers(int a, int b, int c, int d, int e){
        int one = 1;
       if(a > 0){
           int numType = one * a;
           System.out.println(numType + " is a Positive Number");
       }
        if(b > 0){
            int numType = one * b;
            System.out.println(numType + " is a Positive Number");
        }
        if(c > 0){
            int numType = one * c;
            System.out.println(numType + " is a Positive Number");
        }
        if(d > 0){
            int numType = one * d;
            System.out.println(numType + " is a Positive Number");
        }
        if(e > 0){
            int numType = one * e;
            System.out.println(numType + " is a Positive Number");
        }
    }

    public void printNegativeNumbers(int a, int b, int c, int d, int e){
        int one = 1;
        if(a < 0){
            int numType = one * a;
            System.out.println(numType + " is a Negative Number");
        }
        if(b < 0){
            int numType = one * b;
            System.out.println(numType + " is a Negative Number");
        }
        if(c < 0){
            int numType = one * c;
            System.out.println(numType + " is a Negative Number");
        }
        if(d < 0){
            int numType = one * d;
            System.out.println(numType + " is a Negative Number");
        }
        if(e < 0){
            int numType = one * e;
            System.out.println(numType + " is a Negative Number");
        }
    }
    public void printZeroNumbers(int a, int b, int c, int d, int e){
        int zero = 0;
        if(a == 0){
            System.out.println(a + " is a zeros Number");
        }
        if(b == 0){
            System.out.println(b + " is a zeros Number");
        }
        if(c == 0){
            System.out.println(c + " is a zeros Number");
        }
        if(d == 0){
            System.out.println(d + " is a zeros Number");
        }
        if(e == 0){
            System.out.println(e + " is a zeros Number");
        }

    }
}
