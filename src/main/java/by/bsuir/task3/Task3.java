package by.bsuir.task3;

import java.util.ArrayList;

public class Task3 {
    static final double EPSILON = 0.0001;

    public static ArrayList<Double> calcTan(double leftBorder, double rightBorder, double step) {

        if (leftBorder > rightBorder || step < 0 || Math.abs(leftBorder - rightBorder) < EPSILON) {
            throw new IllegalArgumentException();
        }

        ArrayList<Double> result = new ArrayList<>() {};

        for (double x = leftBorder; leftBorder < rightBorder + EPSILON; leftBorder += step)
        {
            double tan = Math.tan(x);
            result.add(tan);
            x += step;
        }

        return result;
    }
}
