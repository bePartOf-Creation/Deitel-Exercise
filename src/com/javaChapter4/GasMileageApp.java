package com.javaChapter4;

import javax.swing.*;


public class GasMileageApp {

    public static void main(String[] args) {
        GasMileage gasMileage = new GasMileage(0,0);
        int trip;
        int tripCounter = 0;
        int totalMilePerGallons = 0;

        reCalculateGasMileage(gasMileage);
        while (gasMileage.getMiles() != -1) {
                trip = gasMileage.calculateGasMileage();
                JOptionPane.showMessageDialog(null, "The Gas Mileage for a Trip " + trip);
                totalMilePerGallons += trip;
                JOptionPane.showMessageDialog(null, "The total Gas Mileage is " + totalMilePerGallons);
            reCalculateGasMileage(gasMileage);

            tripCounter++;
        }
    }

    private static void reCalculateGasMileage(GasMileage gasMileage) {
        gasMileage.setMiles(Integer.parseInt(JOptionPane.showInputDialog(null, "Input Miles Per Trip or enter -1 to exit")));
        if(gasMileage.getMiles() != -1) {
            gasMileage.setGallons(Integer.parseInt(JOptionPane.showInputDialog(null, "Input Gallons Per Trip ")));
            if (gasMileage.getGallons() <= 0) {
                throw new ArithmeticException("Provide a valid value");
            }
        }
    }
}
