package com.javaChapter3;

import javax.swing.*;

public class EmployeeAppTest {
    public static void main(String[] args) {
        Employee itStaff = new Employee("Willy","Charles",0);

        JOptionPane.showConfirmDialog(null,"As an IT Staff,Do you want To Calculate your Annual salary");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your Salary Amount"));
        itStaff.setSalary(salary);
            if(salary < 0){
                JOptionPane.showMessageDialog(null,"Input a positive Value. Thank you");
            }
            else{
                JOptionPane.showMessageDialog(null,itStaff.getFirstName() + "Your Annual Salary is " + itStaff.displayAnnualSalary());
                JOptionPane.showMessageDialog(null,"Then, the 10% Increase of your Salary will be " + itStaff.displaySalaryRaise());
            }

     /* ----------------------The Second ObjectActs as an AdminStaff----------------------------------------------- */
        Employee adminStaff = new Employee("Charly","Billy",0);

        JOptionPane.showConfirmDialog(null,"As an Admin Staff,Do you want To Calculate your Annual salary");
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your Salary Amount"));
        itStaff.setSalary(salary);
            if(salary < 0){
                JOptionPane.showMessageDialog(null,"Input a positive Value. Thank you");
            }
            else{
                JOptionPane.showMessageDialog(null,itStaff.getFirstName() + "Your Annual Salary is " + itStaff.displayAnnualSalary());
                JOptionPane.showMessageDialog(null,"Then, the 10% Increase of your Salary will be " + itStaff.displaySalaryRaise());
            }
    }





}
