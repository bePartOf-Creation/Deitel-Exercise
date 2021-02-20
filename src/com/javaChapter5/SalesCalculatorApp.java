package com.javaChapter5;

import java.util.Scanner;

public class SalesCalculatorApp {
    public static void main(String[] args) {
        SalesCalculator sales = new SalesCalculator(0,0,0);
        Scanner input = new Scanner(System.in);
        double total = 0;
        int  quantitySold = 0;

        System.out.println("Enter Your Product Number or -1 to exit");
        int userInput = input.nextInt();

        while(userInput != -1){
            double price = sales.getRetailValueByProductNumber(userInput);
            total += price;
            quantitySold += sales.getQuantitySold();
            quantitySold++;
            System.out.println("Enter Your Product Number or -1 to exit");
            userInput = input.nextInt();
                if(userInput > 5){
                    quantitySold--;
                    total -= price;
                    System.out.println("wrong input");
                }
        }
        System.out.printf("%s%d%s%.2f","You sold ",quantitySold," items. Your Total Sales for Today is ", total);

    }
}
