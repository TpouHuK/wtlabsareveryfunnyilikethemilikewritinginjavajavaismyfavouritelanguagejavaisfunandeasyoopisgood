package by.bsuir.task8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    @DisplayName("Test with 3 indexes")
    void getInsertionIndexes() {
        double[] firstArray = new double[] {1.0, 1.0, 54.1515};
        double[] secondArray = new double[] {1.0, 2.68, 43.2};
        int[] expectedIndexes = new int[]{ 0, 2, 2};

        assertArrayEquals(expectedIndexes, Task8.getInsertionIndexes(firstArray, secondArray));
    }
}