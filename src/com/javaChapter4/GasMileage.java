package com.javaChapter4;

import javax.swing.*;

public class GasMileage {

    private int miles;
    private int gallons;

    public GasMileage(int miles, int gallons) {
        this.miles = miles;
        this.gallons = gallons;
    }

    public int getMiles() {
        return miles;
    }

    public int getGallons() {
        return gallons;
    }

    public void setMiles(int newMiles) {
        this.miles = newMiles;
    }

    public void setGallons(int newGallons) {
     if(newGallons > 0){
         this.gallons = newGallons;
     }else {
         JOptionPane.showMessageDialog(null,"Invalid Input");
     }
    }

    public int calculateGasMileage() {
        int trip = miles / gallons;
        return trip;
    }
}
