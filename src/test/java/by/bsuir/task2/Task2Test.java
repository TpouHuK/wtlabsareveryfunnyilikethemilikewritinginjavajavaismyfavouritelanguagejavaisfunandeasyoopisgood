package by.bsuir.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    @DisplayName("Point is out of bounds")
    void isBelongArea_True() {
        assertTrue(Task2.isBelongArea(1, 1));
    }

    @Test
    @DisplayName("Point is inside the bounds")
    void isBelongArea_False() {
        assertFalse(Task2.isBelongArea(1, 20));
    }
}