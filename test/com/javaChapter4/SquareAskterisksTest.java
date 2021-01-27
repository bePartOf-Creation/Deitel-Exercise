package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareAskterisksTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testThat_UserCanPrintSquareAsterisk(){
        String display = SquareAsterisks.printSquareShape(9);
        assertEquals("*",display);
    }
}