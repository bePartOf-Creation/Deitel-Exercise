package com.javaChapter8;

import java.util.InputMismatchException;

public class DateOverloaded {
    private int day;
    private int year;
    private int month;

    public DateOverloaded(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public DateOverloaded(String month, int day, int year) {

        this.day = day;
        this.year = year;
    }
    public DateOverloaded(int day, int year) {
        this.day = day;
        this.year = year;
    }
    public void setDay(int day) {
        if(day < 0 || day > 31){
            throw new InputMismatchException("Enter A Valid day");
        } else{
            this.day = day;
        }
    }
    public int getDay() {
        return  day;
    }
    public void setYear(int year) {
        if(year > 1800){
            this.year = year;
        }else{
            throw new InputMismatchException("Enter A Valid Year");
        }
    }
    public int getYear() {
        return year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }

    public int setMonth(String month) {

    }
}
