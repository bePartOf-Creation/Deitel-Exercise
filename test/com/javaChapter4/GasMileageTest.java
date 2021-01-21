package com.javaChapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
        GasMileage gasMileage;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatOurConstructorWorks(){
        gasMileage = new GasMileage(200, 15);
        double miles = gasMileage.getMiles();
        assertEquals(200,miles);

        gasMileage = new GasMileage(200,15);
        double gallons = gasMileage.getGallons();
        assertEquals(15,gallons);
    }

    @Test
    void testThatMilesForATripCanBeUpdated(){
        gasMileage = new GasMileage(200,15);
        gasMileage.setMiles(30);
        assertEquals(30,gasMileage.getMiles());
    }
    @Test
    void testThatGallonsForATripCanBeUpdated(){
        gasMileage = new GasMileage(200,15);
        gasMileage.setGallons(35);
        assertEquals(35,gasMileage.getGallons());
    }
  @Test
  void testThatUserCantInputNegativeValuesAsGallons(){
        gasMileage = new GasMileage(200,15);
        gasMileage.setGallons(-2);
        assertEquals(15,gasMileage.getGallons());
  }
     @Test
    void testThatCalculateGasMileage(){
        gasMileage  = new GasMileage(30,35);
        gasMileage.setMiles(200);
        gasMileage.setGallons(20);
        int gasMileUsage = gasMileage.calculateGasMileage();
        assertEquals(10,gasMileUsage);
     }
}