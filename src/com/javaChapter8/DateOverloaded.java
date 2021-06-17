package com.javaChapter8;

import com.javaChapter3.Date;

import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Optional;

public class DateOverloaded {
    private int day;
    private int year;
    private int month;
    private String monthString;
    private DateEnum date;

    public DateEnum getDate() {
        return date;
    }

    public void setDate(DateEnum date) {
        this.date = date;
    }

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

    public void userInput(String input){
        this.monthString = input;
    }

    public String getMonthAsString(){
        return monthString;
    }

//    public int setAMonth(){
//        return switch(getMonthAsString().toLowerCase()){
//            int month = DateEnum.JANUARY.getMonthAsNumber();
////            case "January", "jan" ->
//
//            default -> throw new IllegalArgumentException("here");
//                    };
//    }
    public static void main(String[] args) {
        DateOverloaded dateOverload = new DateOverloaded("January", 12, 1995);


        System.out.println(DateEnum.JANUARY.getMonthAsNumber());

    }
}
