package by.bsuir.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    @DisplayName("Search prime numbers")
    void searchPrimeNumbers() {
        int[] testData = new int[] { 1, 2, 3, 4, 5, 11, 12, 17};
        ArrayList<Integer> expectedResult = new ArrayList<>(
                Arrays.asList(1, 2, 4, 5, 7)
        );

        assertEquals(expectedResult, Task4.searchPrimeNumbers(testData));
    }
}