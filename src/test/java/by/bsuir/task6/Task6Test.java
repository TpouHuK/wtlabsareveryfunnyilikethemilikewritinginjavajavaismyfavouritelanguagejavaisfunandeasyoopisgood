package by.bsuir.task6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    @DisplayName("Transform matrix")
    void transformMatrix() {
        double[] testData = new double[]{1.0, 2.0, 3.0};
        double[][] expectedResult = new double[][] {{1.0, 2.0, 3.0}, {2.0, 3.0, 1.0}, {3.0, 1.0, 2.0}};

        assertArrayEquals(expectedResult, Task6.TransformMatrix(testData));
    }
}