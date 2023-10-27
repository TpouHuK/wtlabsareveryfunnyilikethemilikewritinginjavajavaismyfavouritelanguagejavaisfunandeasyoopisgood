package by.bsuir.task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    @DisplayName("Calc tan function with correct parameters")
    void calcTan() {
        ArrayList<Double> expectedResult = new ArrayList<>(
            Arrays.asList(-0.10033467208545055, 0.0, 0.10033467208545055, 0.2027100355086725, 0.3093362496096233)
        );
        assertEquals(expectedResult, Task3.calcTan(-0.1, 0.3, 0.1));
    }
}