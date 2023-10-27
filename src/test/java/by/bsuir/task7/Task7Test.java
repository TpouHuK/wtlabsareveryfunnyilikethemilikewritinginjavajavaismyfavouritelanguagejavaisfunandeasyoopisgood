package by.bsuir.task7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    @DisplayName("Correct data")
    void shellSort() {
        double[] expectedResult = new double[]{0.1, 1.2,5.1, 10.00000000000001, 10.00000000000002};
        double[] testData = new double[]{ 0.1, 1.2, 10.00000000000002, 10.00000000000001, 5.1};

        assertArrayEquals(expectedResult, Task7.shellSort(testData));
    }
}