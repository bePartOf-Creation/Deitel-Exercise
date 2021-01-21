package com.javaChapter4;

import java.util.Scanner;

public class SalaryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SalaryCalculator salary = new SalaryCalculator(0);
        int num;
        double pay;
        int counter = 0;

        System.out.println("Enter the number of Employees");
        num = input.nextInt();
        salary.setNumOfEmployees(num);

        while(counter < salary.getNumOfEmployees()){
            System.out.println("Enter the Hours Worked");
            pay = input.nextDouble();
            System.out.println(salary.calculateExcessHours(pay));
            counter++;
        }
    }
}
