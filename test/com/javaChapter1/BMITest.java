package com.javaChapter1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatUserInputWeightInPounds(){
        BMI newBMI = new BMI(12.0, 6.5);
        double weight = newBMI.getWeight();
        assertEquals( 12.0,weight);
    }
    @Test
    void testThatUserInputWeightInPounds_CanBeUpdated(){
        BMI newBMI = new BMI(12.0, 6.5);
        newBMI.setWeight(23.0);
        assertEquals( 23.0,newBMI.getWeight())          ;
    }
    @Test
    void testThatUserInputWeightInPound_CannotInputNegativeValue(){
        BMI newBMI = new BMI(12.0, 6.5);
        newBMI.setWeight(-23.0);
        assertEquals( 12.0,newBMI.getWeight())          ;
    }
    @Test
    void testThatUserInputHeightInPounds(){
        BMI newBMI = new BMI(12.0, 6.5);
        double height = newBMI.getHeight();
        assertEquals( 6.5,height);
    }
    @Test
    void testThatUserInputHeightInPounds_CanBeUpdated(){
        BMI newBMI = new BMI(12.0, 6.5);
        newBMI.setHeight(2.3);
        assertEquals( 2.3,newBMI.getHeight());
    }
    @Test
    void testThatUserInputHeightInPound_CannotInputNegativeValue(){
        BMI newBMI = new BMI(12.0, 6.5);
        newBMI.setHeight(-2.3);
        assertEquals( 6.5,newBMI.getHeight());
    }
    @Test
    void testThatUserCanCalculateBMIValue(){
        BMI newBMI = new BMI(12.0,2.5);
        double bmiValue = newBMI.displayBmiValue();
        assertEquals(1349.76,bmiValue);
    }
    @Test
    void testThatUserCanGetBmiValue(){
        BMI newBMI = new BMI(12.0,2.5);
        double bmiValue =  newBMI.getBmiValue();
        assertEquals(1349.76,bmiValue);
    }

   @Test
    void testThatBMIIValueIsLesserThan18Point5(){
       BMI newBMI = new BMI(0.1,2.5);
       double bmiValue = newBMI.displayBmiValue();
       assertEquals(11.248,bmiValue);
//Test TO display BMI-VALUE Message.    IT MEETS THIS CONDITION
       String message = newBMI.displayMessage("Your BMI Value is " + bmiValue + "\nUnderweight : less than " + 18.5);
       assertEquals(message,newBMI.checkBMIValueRange());

/*To test this condition(if input another displayMessage that does not
meet this condition[bmiValue < 18.5).It throws an error */
       newBMI = new BMI(1, 3);
       bmiValue = newBMI.displayBmiValue();
       assertEquals(78.11111111111111,bmiValue);
//Test TO display BMI-VALUE Message.
       message = newBMI.displayMessage("Your BMI Value is " + bmiValue + "\nObese: between " + 30 + " or Greater");
       assertEquals(message,newBMI.checkBMIValueRange());
   }

    @Test
    void testThatBMIValueIsGreaterThan18Point5AndLesserThanTwentyFourPointNine() {
        BMI newBMI = new BMI(1, 6);
        double bmiValue = newBMI.displayBmiValue();
        assertEquals(19.52777777777778,bmiValue);
//Test TO display BMI-VALUE Message.
        String message = newBMI.displayMessage("Your BMI Value is " + bmiValue + "\nNormal: between " + 18.5 +" and " + 24.9);
        assertEquals(message,newBMI.checkBMIValueRange());

/*To test this condition(if input another displayMessage that does not
meet this condition[bmiValue > 18.5 && bmiValue < 24.9).It throws an error */
        newBMI = new BMI(1, 3);
        bmiValue = newBMI.displayBmiValue();
        assertEquals(78.11111111111111,bmiValue);
//Test TO display BMI-VALUE Message.
        message = newBMI.displayMessage("Your BMI Value is " + bmiValue + "\nObese: between " + 30 + " or Greater");
        assertEquals(message,newBMI.checkBMIValueRange());
    }
    @Test
    void testThatBMIValueIsGreaterThanTwentyFiveAndLesserThanTwentyNinePointNine(){
        BMI newBMI = new BMI(1,5);
        double bmiValue = newBMI.displayBmiValue();
        assertEquals(28.12,bmiValue);
//Test TO display BMI-VALUE Message.
        String message = newBMI.displayMessage("Your BMI Value is " + bmiValue + "\nOverweight: between " + 25 + " and " + 29.9);
        assertEquals(message,newBMI.checkBMIValueRange());

/*To test this condition(if input another displayMessage that does not
meet this condition[bmiValue > 25 && bmiValue < 29.9).It throws an error */
        newBMI = new BMI(1,3);
        bmiValue = newBMI.displayBmiValue();
        assertEquals(78.11111111111111,bmiValue);
//Test TO display BMI-VALUE Message.
        message = newBMI.displayMessage("Your BMI Value is " + bmiValue + "\nObese: between " + 30 + " or Greater");
        assertEquals(message,newBMI.checkBMIValueRange());
    }

    @Test
    void testThatBMIValueIsGreaterThanOrEqualTo30(){
        BMI newBMI = new BMI(1,3);
        double bmiValue = newBMI.displayBmiValue();
        assertEquals(78.11111111111111,bmiValue);
//Test TO display BMI-VALUE Message.
        String message = newBMI.displayMessage("Your BMI Value is " + bmiValue + "\nObese: between 30 or Greater");
        assertEquals(message, newBMI.checkBMIValueRange());
/*To test this condition(if input another displayMessage that does not
meet this condition[bmiValue > 30).It throws an error */
        newBMI = new BMI(0.1, 2.5);
        bmiValue = newBMI.displayBmiValue();
//Test TO display BMI-VALUE Message.
        message = newBMI.displayMessage("Your BMI Value is " + bmiValue + "\nUnderweight : less than " + 18.5);
        assertEquals(message, newBMI.checkBMIValueRange());
    }




}