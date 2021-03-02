package com.javaChapter5;

public class SalesCalculator {
    private int productNumber;
    private int quantitySold;
    private final double retailValue;
    private double price;


    public SalesCalculator(int productNumber, int quantitySold, double retailValue) {
      this.productNumber = productNumber;
      this.quantitySold = quantitySold;
      this.retailValue = retailValue;
    }
    public int getProductNumber() {
        return productNumber;
    }
    public int getQuantitySold() {
        return quantitySold;
    }
    public double getRetailValue() {
        return retailValue;
    }
    public void setQuantitySold(int newQuantitySold) {
        this.quantitySold = newQuantitySold;
    }

//    public void setRetailValue(double retailValue) {
//        this.retailValue = retailValue;
//    }
    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public double getRetailValueByProductNumber(int productNumber) {
        setProductNumber(productNumber);
        switch (getProductNumber()){
            case 1 -> price = 2.98;
            case 2 -> price = 4.50;
            case 3 -> price = 9.98;
            case 4 -> price = 4.49;
            case 5 -> price = 6.87;
        }
        return price;
    }

    public double getPrice() {
        getRetailValueByProductNumber(productNumber);
        return  price;
    }
}
