package com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOddIntegersTest {
        ProductOddIntegers productOddIntegers;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

@Test
void testThat_UserCanSumOddIntegersFrom1to99(){
    productOddIntegers = new ProductOddIntegers();
    int product = productOddIntegers.multiplyOddIntegers();
    assertEquals(2027025,product);
}
}