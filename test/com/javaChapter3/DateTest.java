package com.javaChapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test

    void testThatUser_CanInputValidMonthAfterCreation(){
        Date newDate = new Date(12, 6, 1991);
        int month = newDate.getMonth();
        assertEquals(12,month);
    }

    @Test
    void testThatUser_MonthCanBeUpdated(){
        Date newDate = new Date(12, 6, 1991);
        newDate.setMonth(11);
        int month = newDate.getMonth();
        assertEquals(11,month);
    }

    @Test
    void testThatUser_DoesNotInputInvalidMonth(){
        Date newDate = new Date(12, 12, 1991);
        newDate.setMonth(24);
        int month = newDate.getMonth();
        assertEquals(12,month);
    }

    @Test
    void testThatUser_CannotInputNegativeValue(){
        Date newDate = new Date(12, 12, 1991);
        newDate.setMonth(-3);
        int month = newDate.getMonth();
        assertEquals(12,month);
    }

    @Test
    void testThatUser_CanInputValidDayAfterCreation(){
        Date newDate = new Date(12,4, 1991);
        int day = newDate.getDay();
        assertEquals(4,day);
    }
     @Test
    void testThatUser_DayCanBeUpdated(){
        Date newDate = new Date(12,4, 1991);
        newDate.setDay(24);
        int day = newDate.getDay();
        assertEquals(24,day);
     }
     @Test
    void testThatUser_CannotInputInvalidDay(){
        Date newDate = new Date (12, 4, 1991);
        newDate.setDay(43);
        int day = newDate.getDay();
        assertEquals(4,day);
     }
     @Test
    void testThatUser_CannotInputNegativeValueAsDay(){
        Date newDate = new Date(12,24, 1991);
        newDate.setDay(-4);
        int day = newDate.getDay();
        assertEquals(24,day);
     }
     @Test
    void testThatUser_CanInputAnyYearAfterCreation(){
        Date newDate = new Date(12,4,1991);
        int year = newDate.getYear();
        assertEquals(1991,year);
     }
     @Test
    void testThatUser_InputYearCanBeUpdated(){
        Date newDate = new Date(12,4,1991);
        newDate.setYear(2020);
        int year = newDate.getYear();
        assertEquals(2020,year);
     }
     @Test
    void testThatUser_CannotInputInvalidYear(){
         Date newDate = new Date(12,4,1991);
         newDate.setYear(19912);
         int year = newDate.getYear();
         assertEquals(1991, year);
     }

     @Test
    void testThatUser_CannotInputNegativeValueAsYear(){
        Date newDate = new Date(12,4,2020);
        newDate.setYear(-2001);
        int year = newDate.getYear();
        assertEquals(2020,year);
     }

     @Test
    void  testThatUser_CanDisplayDate(){
        Date newDate = new Date(10,5,2020);
        String display = newDate.displayDate();
        assertEquals("10/5/2020",display);
     }
}