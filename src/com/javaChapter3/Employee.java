package com.javaChapter3;

import javax.swing.*;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
       if(salary > 0){
           this.salary = salary;
       }
       else{
           JOptionPane.showMessageDialog(null, "Error!!!!");
       }

    }

    public double displayAnnualSalary() {
        return salary * 12;
    }

    public double displaySalaryRaise() {
        return salary + (salary * 0.1);
    }
}
