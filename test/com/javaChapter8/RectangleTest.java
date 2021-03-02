package com.javaChapter8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatOurConstructorWorks() {
        rectangle = new Rectangle(0.0, 0.0);
        assertNotNull(rectangle);
    }

    @Test
    void testThatUser_Can_Enter_ValidLengthInput() {
        rectangle = new Rectangle(0.0, 0.0);
        rectangle.setLength(2.0);
        double length = rectangle.getLength();
        assertEquals(2.0, length);
        assertThrows(IllegalArgumentException.class, () -> rectangle.setLength(-1.0));
    }
    @Test
    void testThatUser_Can_Enter_ValidWidthInput() {
        rectangle = new Rectangle(0.0, 0.0);
        rectangle.setWidth(2.0);
        double length = rectangle.getWidth();
        assertEquals(2.0, length);
        assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(-1.0));
    }
@Test
    void testThatUserCan_CalculateArea_Of_A_Rectangle(){
        rectangle = new Rectangle(0.0,0.0);
        rectangle.setLength(7.0);
        rectangle.setWidth(2.0);
        double area = rectangle.calculateArea();
        assertEquals(14.0,area);
    }
    @Test
    void testThatUserCan_CalculatePerimeter_Of_A_Rectangle(){
        rectangle = new Rectangle(0.0,0.0);
        rectangle.setLength(7.0);
        rectangle.setWidth(2.0);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(18.0,perimeter);
    }

}