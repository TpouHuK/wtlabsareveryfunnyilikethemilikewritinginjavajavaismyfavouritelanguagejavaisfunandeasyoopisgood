package by.bsuir.task9;

import java.util.ArrayList;

public class Basket {
    private double totalWeight;
    private final ArrayList<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
        this.totalWeight = 0;
    }

    public Basket(ArrayList<Ball> balls){
        this.balls = balls;

        double sum = 0;
        for (Ball ball : balls) {
            sum += ball.weight;
        }
        this.totalWeight = sum;
    }

    public void addBall(Ball ball){
        this.balls.add(ball);
        this.totalWeight += ball.weight;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }

    public long getBlueBallsCount() {
        return this.balls.stream().filter(ball -> ball.color == Color.BLUE).count();
    }

    public ArrayList<Ball> getBalls() {
        return this.balls;
    }
}
