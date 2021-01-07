package com.javaChapter5;
public class BarChartPrintingProgram{

    public void printItOut(int num){
        int i;
        if(num > 0 && num < 31){
            for(i=0; i<num;i++){
                System.out.print("*");
            }
        }
        else{
            System.out.print(num + " is Invalid Value");
        }
        System.out.println("");
    }
}