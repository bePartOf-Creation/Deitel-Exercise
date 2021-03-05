package com.javaChapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    DuplicateElimination duplicates;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testToUserInputs(){
        duplicates = new DuplicateElimination();
        int[] userInput = {10,20,34,56,20};
        assertNotNull(userInput);
        assertEquals(5,userInput.length);
    }

    @Test
    void testThatUserInputMustNotSurpassTenToHundred() {
        duplicates = new DuplicateElimination();
        int[] inputs = {0,120,134,56,20};
        assertThrows(IllegalArgumentException.class, () -> duplicates.inputMustBeTenToHundred(inputs));
    }

    @Test
    void testThatUserInputIsNotMoreThanFive(){
        duplicates = new DuplicateElimination();
        int[] inputs = {10,20,20,27,36,39};
        assertThrows(IllegalArgumentException.class, ()-> duplicates.inputSizeIsNotMoreThanFive(inputs));
    }

    @Test
    void testToArrayIsNotEmpty(){
        duplicates =  new DuplicateElimination();
        int[] emptyArray =  {};
        assertThrows(IllegalArgumentException.class, ()-> duplicates.inputSizeIsNotMoreThanFive(emptyArray));
    }

    @Test
    void testToEliminateDuplications(){
        duplicates = new DuplicateElimination();
        int[] arrayAsInputs = {10,20,34,20,90};
        int[] userInputs = duplicates.removeDuplicates(arrayAsInputs);
        assertEquals(90,userInputs[3]);
        System.out.println(Arrays.toString(userInputs));
    }
}