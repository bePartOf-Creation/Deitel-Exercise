package com.javaChapter8;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(double newLength) {
        boolean LengthIsInvalid = newLength < 0;
        if(LengthIsInvalid){
            throw new IllegalArgumentException("Enter a Valid length Greater Than 0");
        }else{
            this.length = newLength;
        }
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double newWidth) {
        boolean WidthIsInvalid = newWidth < 0;
        if(WidthIsInvalid){
            throw  new IllegalArgumentException("Enter a Valid Width Value Greater Than 0");
        }else{
            this.width = newWidth;
        }
    }
    public double getWidth() {
        return width;
    }

    public double calculatePerimeter() {
        double length = getLength();
        double width = getWidth();

        return (2 *length) + (2 * width);
    }

    public  double calculateArea() {
        double length = getLength();
        double width = getWidth();

        return length * width;
    }
}
