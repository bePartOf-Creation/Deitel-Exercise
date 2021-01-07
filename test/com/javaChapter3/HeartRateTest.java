package com.javaChapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatUser_CanInputFirstNameAfterCreation() {
        HeartRate newHeartsRate = new HeartRate("Ebun", "Williams", 12, 31, 1991);
        String firstName = newHeartsRate.getFirstName();
        assertEquals("Ebun", firstName);
    }

    @Test
    void testThatUser_FirstNameCanUpdated() {
        HeartRate newHeartsRate = new HeartRate("Ebun", "Williams", 12, 31, 1991);
        newHeartsRate.setFirstName("Femi");
        String firstName = newHeartsRate.getFirstName();
        assertEquals("Femi", firstName);
    }

    @Test
    void testThatUser_CanBeInputLastNameAfterCreation() {
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 31, 1991);
        String lastName = newHeartsRate.getLastName();
        assertEquals("Williams", lastName);
    }

    @Test
    void testThatUser_LasTNameCanBeUpdated() {
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 31, 1991);
        newHeartsRate.setLastName("Owolabi");
        String lastName = newHeartsRate.getLastName();
        assertEquals("Owolabi", lastName);
    }

    @Test
    void testThatUserCanInputValidMonth() {
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 31, 1991);
        int month = newHeartsRate.getMonth();
        assertEquals(12, month);
    }

    @Test
    void testThatUser_InputMonthCanBeUpdated() {
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 31, 1991);
        newHeartsRate.setMonth(3);
        int month = newHeartsRate.getMonth();
        assertEquals(3, month);
    }

    @Test
    void testThatUserCannotInputInValidMonth(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 31, 1991);
        newHeartsRate.setMonth(32);
        int month = newHeartsRate.getMonth();
        assertEquals(12, month);
    }

    @Test
    void testThatUser_CanInputNegativeValue(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 31, 1991);
        newHeartsRate.setMonth(-12);
        int month = newHeartsRate.getMonth();
        assertEquals(12, month);
    }

    @Test
    void testThatUser_CanInputValidDayAfterCreation(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 31, 1991);
        int day = newHeartsRate.getDay();
        assertEquals(31, day);
    }

    @Test
    void testThatUser_DayCanBeUpdated(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3, 1991);
        newHeartsRate.setDay(23);
        int day = newHeartsRate.getDay();
        assertEquals(23, day);
    }
    @Test
    void  testThatUser_CannotInputInvalidDay(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3, 1991);
        newHeartsRate.setDay(65);
        int day = newHeartsRate.getDay();
        assertEquals(3,day);
    }
    @Test
    void testThatUser_CannotInputNegativeValueAsDay(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3, 1991);
        newHeartsRate.setDay(-65);
        int day = newHeartsRate.getDay();
        assertEquals(3,day);
    }
    @Test
    void testThatUser_CanInputValidYearAfterCreation(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        int year = newHeartsRate.getYear();
        assertEquals(1991,year);
    }
    @Test
    void testThatUser_YearCanBeUpdated(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        newHeartsRate.setYear(2002);
        int year = newHeartsRate.getYear();
        assertEquals(2002,year);
    }
    @Test
    void testThatUser_CannotInputInvalidYear(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,2002);
        newHeartsRate.setYear(100);
        int year = newHeartsRate.getYear();
        assertEquals(2002,year);
    }
    @Test
    void testThatUser_CannotInputNegativeValueAsValueAsYear(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,2002);
        newHeartsRate.setYear(-20002);
        int year = newHeartsRate.getYear();
        assertEquals(2002,year);

        newHeartsRate.setYear(-2);
        year = newHeartsRate.getYear();
        assertEquals(2002,year);
    }
    @Test
    void testThatUser_CanDisplayAge(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        newHeartsRate.setYear(1991);
        int age = newHeartsRate.displayAge();
        assertEquals(29,age);
    }
    @Test
    void testThatUser_InvalidYearForAge(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        newHeartsRate.setYear(-1991);
        //int age = newHeartsRate.displayAge();
        assertEquals(1991,newHeartsRate.getYear());
    }
    @Test
    void testThatUser_CanDisplayDateOfBirth(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        String display = newHeartsRate.getDateOfBirth().displayDate();
        assertEquals("12/3/1991",display);
    }
    @Test
    void testThatUser_DateOfBirthCanBeUpdated(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        newHeartsRate.setMonth(1);
        newHeartsRate.setDay(7);
        newHeartsRate.setYear(2016);
        String display = newHeartsRate.setDateOfBirth().displayDate();
        assertEquals("1/7/2016", display);
    }
    @Test
    void testThatUser_CanGetMaximumHeartRateValue(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        newHeartsRate.displayAge();
        int maximumHeartRate = newHeartsRate.displayMaximumHeartRate();
        assertEquals(191,maximumHeartRate);

        newHeartsRate.setYear(2000);
        newHeartsRate.displayAge();
        maximumHeartRate = newHeartsRate.displayMaximumHeartRate();
        assertEquals(200,maximumHeartRate);

        newHeartsRate.setYear(20070);
        newHeartsRate.displayAge();
        maximumHeartRate = newHeartsRate.displayMaximumHeartRate();
        assertEquals(200,maximumHeartRate);
    }

    @Test
    void testThatUser_CanCalculateMinimumValueOfTargetHeartRange(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        int minValue = newHeartsRate.calculateMinimumHeartRate();
        assertEquals(95.0,minValue);
    }
    @Test
    void testThatUser_CanCalculateMaximumValueOfTargetHeartRange(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        int minValue = newHeartsRate.calculateMaximumHeartRate();
        assertEquals(162.0,minValue);
    }
    @Test
    void testTHatUserCanDisplayTargetHeartRate(){
        HeartRate newHeartsRate = new HeartRate("Femi", "Williams", 12, 3,1991);
        newHeartsRate.calculateMinimumHeartRate();
        newHeartsRate.calculateMaximumHeartRate();
        String display = newHeartsRate.displayTargetHeartRange();
        assertEquals("TargetHeartRange is between " + newHeartsRate.calculateMinimumHeartRate() + " and " + newHeartsRate.calculateMaximumHeartRate(),display);
    }
}