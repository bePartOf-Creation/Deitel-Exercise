package com.javaChapter3;

import javax.swing.*;

public class HeartRateApp {
    public static void main(String[] args) {
        HeartRate newHeartRate = new HeartRate("Olasunkanmi","Olayinka",0,0,0);

        String firstName = JOptionPane.showInputDialog("Enter your First Name");
        newHeartRate.setFirstName(firstName);
        String lastName = JOptionPane.showInputDialog("Enter your Last Name");
        newHeartRate.setLastName(lastName);
        int userDayOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter your Day Of Birth"));
        newHeartRate.setDay(userDayOfBirth);
        int userMonthOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter your Month Of Birth"));
        newHeartRate.setMonth(userMonthOfBirth);
        int userYearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter your Year Of Birth"));
        newHeartRate.setYear(userYearOfBirth);
        newHeartRate.setDateOfBirth().displayDate();

        JOptionPane.showMessageDialog(null,"Hi! " + newHeartRate.getFirstName() +
                " " + newHeartRate.getLastName() + "\nYour Date Of Birth is : " + newHeartRate.getDateOfBirth().displayDate() + "\nAge : "
                + " " + newHeartRate.displayAge() + "\nAnd your Maximum HeartRate is " + " " + newHeartRate.displayMaximumHeartRate());




    }
}
