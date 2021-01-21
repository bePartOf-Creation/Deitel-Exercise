package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
        SalaryCalculator salary;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatConstructorWorks(){
        salary = new SalaryCalculator(2);
        int num = salary.getNumOfEmployees();
        int basic = salary.getBasicHourWorked();
        int perHour = salary.getPayPerHour();

        assertEquals(2,num);
        assertEquals(40,basic);
        assertEquals(100,perHour);
    }

    @Test
    void testThatNumberOfEmployeesCanBeUpdated(){
        salary = new SalaryCalculator(2);
        salary.setNumOfEmployees(9);
        assertEquals(9,salary.getNumOfEmployees());
    }
    @Test
    void testThatNegativeValueCannotBeInputAsNumberOfEmployees(){
        salary = new SalaryCalculator(2);
        salary.setNumOfEmployees(-9);
        assertEquals(2,salary.getNumOfEmployees());
    }

    @Test
    void testThatCalculatePayForBasicHoursWorked(){
        salary = new SalaryCalculator(2);
        salary.basicPayForBasicHours();
        assertEquals(4000.0, salary.basicPayForBasicHours());
    }

    @Test
    void testThatCalculateGrossPayForWorkedInExcessOf40Hours(){
        salary = new SalaryCalculator(2);
        salary.setNumOfEmployees(2);
        double excessPay =  salary.calculateExcessHours(46);
        assertEquals(4300.0,excessPay);


    }
}