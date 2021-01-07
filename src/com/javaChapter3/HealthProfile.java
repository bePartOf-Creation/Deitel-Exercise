package com.javaChapter3;

import com.javaChapter1.BMI;

import javax.swing.*;

public class HealthProfile {

    private Date dateOfBirth;


    private HeartRate heartRate;
//    private HeartRate maxTargetHeartRate;
//    private HeartRate maxHeartRate;
    private BMI bmiValue;
//    private String firstName;
//    private String lastName;
    private String gender;
//    private int month;
//    private int day;
//    private int year;
//    private double height;
//    private double weight;

    public HealthProfile(Date dateOfBirth, BMI bmiValue, String gender, HeartRate heartRate){
        this.dateOfBirth = dateOfBirth;
        this.bmiValue = bmiValue;
        this.heartRate = heartRate;
        setGender(gender);
    }

    public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, double weight, double height) {
//        this.firstName = firstName;
//        this.lastName  = lastName;
         setGender(gender);
//        this.month = month;
//        this.day = day;
//        this.year = year;
        this.dateOfBirth = new Date(month, day, year);
//        this.height = height;
//        this.weight = weight;
//        this.age = new HeartRate(firstName,lastName,month,day,year);
//        this.maxHeartRate = new HeartRate(firstName,lastName,month,day,year);
//        this.maxTargetHeartRate = new HeartRate(firstName, lastName, month, day, year);
        this.heartRate = new HeartRate(firstName, lastName, month, day, year);
        this.bmiValue = new BMI(weight,height);
//        this.bmiValue = new BMI(weight, height);

    }
//    public String getFirstName() {
//        return firstName;
//    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
      if(gender.equals("f") ||(gender.equals("F")
        || (gender.equals("female")|| gender.equals("Female")))){
          this.gender = "female";
      }else
          { if(gender.equals("m")||(gender.equals("M")
           || (gender.equals("male") || (gender.equals("Male"))))){
                  this.gender = "male";
          }else{
              JOptionPane.showMessageDialog(null,"Oga You Go Chop Slap Ooo.\nPut Ur Gender\nNot Your Gender Joor");
          }
      }
    }
//    public int getMonth() {
//        return  month;
//    }

//    public void setMonth(int month) {
//        if (month > 0 && month < 13) {
//            this.month = month;
//        } else {
//            JOptionPane.showMessageDialog(null, "Invalid Month");
//        }
//    }

//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//      if(day > 0 && day < 32){
//          this.day = day;
//      }else{
//          JOptionPane.showMessageDialog(null,"Invalid Day");
//      }
//    }

//    public int getYear() {
//        return  year;
//    }
//
//    public void setYear(int year) {
//      if(year > 1800 && year < 2029){
//          this.year = year;
//      }else{
//          JOptionPane.showMessageDialog(null,"Invalid Year");
//      }
//    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

//    public Date setDateOfBirth() {
//        this.dateOfBirth = new Date(month, day, year);
//        return  dateOfBirth;
//    }

//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//      if(height > 0){
//          this.height = height;
//      } else{
//          JOptionPane.showMessageDialog(null,"Invalid Height");
//      }
//    }

//    public double getWeight() {
//        return weight;
//    }

//    public void setWeight(double weight) {
//       if(weight > 0){
//            this.weight = weight;
//        }else{
//           JOptionPane.showMessageDialog(null,"Invalid Weight");
//       }
//    }

//    public HeartRate getUserAge() {
//        return age;
//    }

//    public HeartRate setUserAge() {
//        this.age = new HeartRate(firstName,lastName,month,day,year);
//        return  age;
//    }
//
//    public HeartRate getMaxHeartRate() {
//        return heartRate;
//    }
//
//    public HeartRate setMaxHeartRate() {
//        this.maxHeartRate = new HeartRate(firstName,lastName,month,day,year);
//        return maxHeartRate;
//    }

    public HeartRate getHeartRate() {
        return heartRate;
    }
    public void setHeartRate(HeartRate heartRate) {
        this.heartRate = heartRate;
    }
//    public HeartRate setMinTargetHeartRate() {
//        this.heartRate = new HeartRate(firstName,lastName,month,day,year);
//        return heartRate;
//    }
//    public HeartRate getMaxTargetHeartRate() {
//        return maxTargetHeartRate;
//    }

//    public HeartRate setMaxTargetHeartRate() {
//        this.maxTargetHeartRate = new HeartRate(firstName,lastName,month,day,year);
//        return maxTargetHeartRate;
//    }
    public BMI getBMIValue() {
        return bmiValue;
    }
    public void setBMIValue(BMI bmiValue) {
       this.bmiValue = bmiValue;
    }



}
