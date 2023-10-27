package by.bsuir.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    @DisplayName("Calculate expression with correct assertion")
    public void calcExpressionWithCorrectAssertion() {
        Assertions.assertEquals(1.913410905215903, Task1.calcExpression(1.0, 1.0));
    }

    @Test
    @DisplayName("Calculate expression with x = 0")
    public void calcExpressionWithXEqualsZero() {
        Assertions.assertEquals(0.8540367091367855, Task1.calcExpression(0.0, 1.0));
    }
}