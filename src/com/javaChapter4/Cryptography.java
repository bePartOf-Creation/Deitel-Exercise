package com.javaChapter4;

public class Cryptography {

    private int firstModulus;
    private int secondModulus;
    private int thirdModulus;
    private int fourthModulus;
    private int encryptValue;
    private int modValue;
    private int userInput;


    public Cryptography(int firstModulus, int secondModulus, int thirdModulus, int fourthModulus) {
        this.firstModulus = firstModulus;
        this.secondModulus = secondModulus;
        this.thirdModulus = thirdModulus;
        this.fourthModulus = fourthModulus;
        this.encryptValue = 7;
        this.modValue = 10;

    }

    public Cryptography(int userInput) {
        this.userInput = userInput;
    }

    public int getFirstModulus() {
        return firstModulus;
    }

    public void setFirstModulus(int firstModulus) {
        int newValue= firstModulus + encryptValue;
        this.firstModulus = newValue % modValue;
    }

    public void setSecondModulus(int secondModulus) {
        int newValue= secondModulus + encryptValue;
        this.secondModulus = newValue % modValue;
    }

    public int getSecondModulus() {
        return secondModulus;
    }

    public void setThirdModulus(int thirdModulus) {
        int newValue= thirdModulus + encryptValue;
        this.thirdModulus = newValue % modValue;
    }

    public int getThirdModulus() {
        return thirdModulus;
    }

    public void setFourthModulus(int fourthNumber) {
        int newValue= fourthNumber + encryptValue;
        this.fourthModulus = newValue % modValue;
    }

    public int getFourthModulus() {
        return fourthModulus;
    }

    public void setEncryptValue(int ENCRYPT_VALUE) {
        this.encryptValue = ENCRYPT_VALUE ;

    }
    public int getEncryptValue() {
        return encryptValue;
    }

    public void setModValue(int MOD_VALUE) {
        this.modValue = MOD_VALUE;
    }
    public int getModValue() {
        return modValue;
    }
    public String encryptUserInput() {
        String value = "";
        value = "" + thirdModulus + "" + firstModulus +
                "" + fourthModulus + "" + secondModulus;
        return  value;
    }


    public void decryptUserInput() {
        this.firstModulus = (getFirstModulus() + getModValue()) - getEncryptValue();
        this.secondModulus = (getSecondModulus() + getModValue()) - getEncryptValue();
        this.thirdModulus = (getThirdModulus() + getModValue()) - getEncryptValue();
        this.fourthModulus = (getFourthModulus() + getModValue()) - getEncryptValue();
    }

    public String displayDecryptedValue() {
        String value = "";
        value = "" + firstModulus + "" + secondModulus +
                "" + thirdModulus + "" + fourthModulus;
        return  value;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getUserInput() {
        return  userInput;
    }

    public void separate() {
        int secondInput = getUserInput() / 10; //4529
        firstModulus = getUserInput() % 10; //8
        int thirdInput = secondInput / 10; //452
        secondModulus = secondInput % 10; //9
        int fourthInput = thirdInput / 10;//45
        thirdModulus = thirdInput % 10;//2
        int fifthInput = fourthInput / 10;//4
        fourthModulus = fourthInput % 10;//5

    }

}
