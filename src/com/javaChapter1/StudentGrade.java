package com.javaChapter1;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grade;
        double total = 0;
        int studentGradeCounter = 1;

        while(studentGradeCounter <= 10){
            System.out.println("Enter Your Grade: " );
            grade = input.nextDouble();
            if(grade < 0.0 && grade > 100.0){
                System.out.println("Input the correct Score. Thank you");
            }else
            if(grade <= 101.0){
                total = total + grade;
                studentGradeCounter++;
            }


        }
        double average = total/ 10;
        System.out.printf("Your Class Average is %f%n",average);
    }
}
