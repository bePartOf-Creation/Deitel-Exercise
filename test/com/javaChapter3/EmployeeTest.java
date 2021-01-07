package com.javaChapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatUser_CanInputFirstName() {
        Employee newStaff = new Employee("Bolt", "Mike", 39000.56);
        String staffFirstName = newStaff.getFirstName();
        assertEquals("Bolt", staffFirstName);
    }

    @Test
    void thatThatUser_FirstNameCanBeUpdated() {
        Employee newStaff = new Employee("Bolt", "Mike", 39000.56);
        newStaff.setFirstName("Bolton");
        assertEquals("Bolton", newStaff.getFirstName());
    }
    @Test
    void testThatUser_CanInputLastName() {
        Employee newStaff = new Employee("Bolt","Mike", 39000.56);
        String staffLastName = newStaff.getLastName();
        assertEquals("Mike", staffLastName);
    }

    @Test
    void testThatUser_LastNameCanBeUpdated() {
        Employee newStaff = new Employee("Bolt", "Mike", 39000.56);
        newStaff.setLastName("Micheal");
        assertEquals("Micheal", newStaff.getLastName());
    }

    @Test
    void testThatUser_SalaryIsPositive(){
        Employee newStaff = new Employee("Bolton","Micheal",39000.56);
        double staffSalary = newStaff.getSalary();
        assertEquals(39000.56, staffSalary);
    }
    @Test
    void testThatUser_SalaryCanBeUpdated(){
        Employee newStaff = new Employee("Bolton","Micheal",39000.56);
        newStaff.setSalary(76500.34);
        assertEquals(76500.34, newStaff.getSalary());
    }
    @Test
    void testThatUser_SalaryIsNotNegative() {
        Employee newStaff = new Employee("Bolton", "Micheal", 39000.56);
        newStaff.setSalary(-4300);
        assertEquals(39000.56, newStaff.getSalary());
    }
    @Test
    void testThatUser_CanCalculateItsAnnualSalary(){
        Employee newStaff = new Employee("Bolton", "Micheal", 39000.56);
        newStaff.setSalary(39000.56);
        double staff = newStaff.displayAnnualSalary();
        assertEquals(468006.72,staff);
    }
    @Test
    void testThatUser_CanBeGetTenPercentSalaryRaise(){
        Employee newStaff = new Employee("Bolton", "Micheal", 39000.56);
        newStaff.setSalary(39000);
        double staff = newStaff.displaySalaryRaise();
        assertEquals(42900,staff);
        }
    }

