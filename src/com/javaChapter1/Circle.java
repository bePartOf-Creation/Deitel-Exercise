package com.javaChapter1;

public class Circle {

    public void diameterOfACircle(double radius){
        final double PI = 3.14159;
        double diameter;
        if(radius > 0){
            System.out.printf("Your Diameter is : %f%n" , (diameter = 2 * radius));
        }
        else{
            System.out.println("Your Input is Invalid");
        }
    }
    public void circumferenceOfACircle(double radius){
        final double PI = 3.14159;
        double circumference;
        if (radius > 0){
            System.out.printf("Your Circumference is : %f%n" , (circumference = 2 * PI * radius));
        }
        else{
            System.out.println("Your Input is Invalid");
        }
    }
    public void areaOfACircle(double radius){
        final double PI = 3.14159;
        double area;
        if(radius >0){
            System.out.printf("Your Area Is : %f%n" , (area =  PI * radius * radius));
        }
        else{
            System.out.println("Your Input Is Invalid");
        }
    }
}
