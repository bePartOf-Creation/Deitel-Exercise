package com.javaChapter8;

import java.util.Scanner;
public class RectangularApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0.0,0.0);
        Scanner input = new Scanner(System.in);
        int userChoice;
          try{
              do {
                  System.out.println("Press 1 - To calculate The Area of Rectangle");
                  System.out.println("Press 2 - To calculate The Perimeter of Rectangle");
                  userChoice = input.nextInt();
                  System.out.println("Enter Length Value");
                  double newLength = input.nextDouble();
                  System.out.println("Enter Width Value");
                  double newWidth = input.nextDouble();
                  if(userChoice < 1 || userChoice > 2){
                      throw  new IllegalArgumentException("Wrong Input.Please Enter 1 or 2");
                  }

                  switch (userChoice){
                      case 1  -> calculateAreaOfRectangle(newLength, newWidth);
                      case 2  -> calculatePerimeterOfRectangle(newLength, newWidth);
                  }
              }
              while (userChoice == 1 );
              System.out.println("Press 1 - To calculate The Area of Rectangle");
              System.out.println("Press 2 - To calculate The Perimeter of Rectangle");
              userChoice = input.nextInt();
          }
          catch (IllegalArgumentException e){
              System.out.println("Wrong Choice .Please Enter 1 or 2");
          }
    }
    private static void calculateAreaOfRectangle(double newLength, double newWidth){
        Rectangle rectangle = new Rectangle(newLength,newWidth);
        rectangle.setLength(newLength);
        rectangle.setWidth(newWidth);
        System.out.printf("%s%.2f%n","Area Of Rectangle is ",rectangle.area());
        rectangle.area();
    }
    private static void calculatePerimeterOfRectangle(double newLength, double newWidth){
        Rectangle rectangle = new Rectangle(newLength,newWidth);
        rectangle.setLength(newLength);
        rectangle.setWidth(newWidth);
        System.out.printf("%s%.2f%n","Perimeter Of Rectangle is ",rectangle.perimeter());
        rectangle.perimeter();
    }
}
