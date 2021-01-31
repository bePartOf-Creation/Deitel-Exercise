package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabularOutputTest {
    TabularOutputApp output;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void test_theseVariablesDeclaredIsConstant(){


        int inTen = TabularOutputApp.getInTen(10);
        int inHundred = TabularOutputApp.getInHundred(100);
        int inThousand = TabularOutputApp.getInThousand(1000);


        assertEquals(10,inTen);
        assertEquals(100,inHundred);
        assertEquals(1000,inThousand);
    }
}