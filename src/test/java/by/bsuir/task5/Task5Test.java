package by.bsuir.task5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    @DisplayName("No unnecessary numbers")
    void countUnnecessaryNumbersWhereIsEmptyArray() {
        int[] testData = new int[] {};
        int expectedResult = 0;

        assertEquals(expectedResult, Task5.countUnnecessaryNumbers(testData));
    }

    @Test
    @DisplayName("No unnecessary numbers")
    void countUnnecessaryNumbersWhereIsNoUnnecessaryNumbers() {
        int[] testData = new int[] {1, 2, 3,4, 5};
        int expectedResult = 0;

        assertEquals(expectedResult, Task5.countUnnecessaryNumbers(testData));
    }

    @Test
    @DisplayName("One unnecessary numbers")
    void countUnnecessaryNumbersWhereIsOneUnnecessaryNumbers() {
        int[] testData = new int[] {1, 2, 0, 4, 5};
        int expectedResult = 1;

        assertEquals(expectedResult, Task5.countUnnecessaryNumbers(testData));
    }
}