package com.javaChapter3;

import javax.swing.*;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;
    private Date dateOfBirth;


    public HeartRate(String firstName, String lastName, int month, int day, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(month, day, year);
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
       if(month > 0 && month < 13){
           this.month = month;
       }else{
           JOptionPane.showMessageDialog(null,"Invalid Month Of Birth");
       }
    }

    public int getDay() {
        return  day;
    }

    public void setDay(int day) {
      if(day > 0 && day < 32){
          this.day = day;
      }else{
          JOptionPane.showMessageDialog(null,"Invalid Day Of Birth");
      }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
      if(year > 1800 && year < 2029){
          this.year = year;
      }else{
          JOptionPane.showMessageDialog(null,"Invalid Year Of Birth");
      }
    }

    public int displayAge() {
        int currentYear = 2020;
        int age = currentYear - year;
            if (year > 1800 && year < 2029) {
                return age;
            } else if (year < 0){
                return currentYear;
            }
        return 0;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public Date setDateOfBirth(){
        this.dateOfBirth = new Date(month, day, year);
        return dateOfBirth;
    }
    public int displayMaximumHeartRate() {
        return (220 - displayAge());
    }

    public int calculateMinimumHeartRate() {
        final int MIN_VALUE = 50;
        int minTargetValue = (MIN_VALUE * displayMaximumHeartRate())/ 100;
        return minTargetValue;
    }

    public int calculateMaximumHeartRate() {
        final int MAX_VALUE = 85;
        int maxTargetValue = (MAX_VALUE * displayMaximumHeartRate())/ 100;
        return maxTargetValue;
    }

    public String displayTargetHeartRange() {
        String message = "TargetHeartRange is between " + calculateMinimumHeartRate() + " and " + calculateMaximumHeartRate();
         JOptionPane.showMessageDialog(null, message);
        return message;
    }
}
