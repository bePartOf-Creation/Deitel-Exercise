package com.javaChapter8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class DateOverloadedTest {
    DateOverloaded date;
    @BeforeEach
    void setUp() {
        date = new DateOverloaded(12,1,2021);
        date = new DateOverloaded("June",16,1996);
        date = new DateOverloaded(16,2000);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatUserCanEnterDay(){
        date.setDay(31);
        assertEquals(31,date.getDay());
    }
    @Test
    void testThatDayInDateIsValid() {
        try {
            date.setDay(32);
            assertEquals(16, date.getDay());
        }catch(InputMismatchException inputMismatchException){
            inputMismatchException.getMessage();
        };
        assertThrows(InputMismatchException.class, () -> date.setDay(32));
    }
    @Test
    void testDateHasAValidYear(){
        date.setYear(1992);
        assertEquals(1992,date.getYear());
    }
    @Test
    void testThatYearInDateIsValid() {
        try {
            date.setYear(32);
            assertEquals(2021, date.getYear());
        }catch(InputMismatchException inputMismatchException){
            inputMismatchException.getMessage();
        };
        assertThrows(InputMismatchException.class, () -> date.setYear(32));
    }
    @Test
    void testThatUserCanEnterMonth(){
        date.setMonth(12);
        assertEquals(12,date.getMonth());
    }
    @Test
    void testThatUserCanEnterMonthAsString(){
//        date.setMonth("June");
        assertEquals(6,date.getMonth());
    }
}