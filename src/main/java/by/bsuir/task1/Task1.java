package by.bsuir.task1;

public class Task1 {
    public static double calcExpression(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - ((2 * x) / (1 + x * x * y * y)));
        return (numerator / denominator) + x;
    }
}
