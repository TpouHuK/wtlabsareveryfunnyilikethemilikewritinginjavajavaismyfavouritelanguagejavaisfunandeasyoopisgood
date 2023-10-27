package by.bsuir.task9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    @DisplayName("Add ball")
    void addBall() {
        Basket basket = new Basket();
        Ball ball = new Ball(1.0, Color.BLACK);

        basket.addBall(ball);
        ArrayList<Ball> ballsFromBasket = basket.getBalls();

        assertEquals(ball, ballsFromBasket.get(0));
    }

    @Test
    @DisplayName("Get total weight")
    void getTotalWeight() {
        Basket basket = new Basket();
        Ball ball = new Ball(1.0, Color.BLACK);
        double expectedBasketWeight = 1.0;

        basket.addBall(ball);

        assertEquals(expectedBasketWeight, basket.getTotalWeight());
    }

    @Test
    @DisplayName("Get blue balls")
    void getBlueBalls()
    {
        Basket basket = new Basket();
        Ball ball = new Ball(1.0, Color.BLUE);
        long expectedBallsCount = 1;

        basket.addBall(ball);

        assertEquals(expectedBallsCount, basket.getBlueBallsCount());
    }
}