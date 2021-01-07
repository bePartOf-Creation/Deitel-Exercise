package com.javaChapter3;

import javax.swing.*;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public int getMonth() {
        return  month;
    }

    public void setMonth(int month) {
       if(month > 0 && month < 13){
           this.month = month;
       }else{
           JOptionPane.showMessageDialog(null,"Invalid Month");
       }

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
       if(day > 0 && day < 32){
           this.day = day;
       }else{
           JOptionPane.showMessageDialog(null,"Invalid Day");
       }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
      if(year > 1800 && year < 2029){
          this.year = year;
      }else{
          JOptionPane.showMessageDialog(null,"InValid Year");
      }

    }

    public String displayDate() {
      return (month + "/" + day + "/" + year);
    }

}


