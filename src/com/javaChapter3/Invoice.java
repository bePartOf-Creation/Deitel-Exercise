package com.javaChapter3;

import javax.swing.*;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;

    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
      if(quantity > 0){
          this.quantity = quantity;
      } else if(quantity < 0){
          this.quantity = 0;
      }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
      if(price > 0){
          this.price = price;
      }else if(price < 0){
         this.price = 0.0;
      }
    }

    public double displayInvoiceAmount() {
       this.price = price * quantity;
        return  price;
    }
}
