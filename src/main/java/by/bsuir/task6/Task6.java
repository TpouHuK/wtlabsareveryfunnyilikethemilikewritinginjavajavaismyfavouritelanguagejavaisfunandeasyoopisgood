package by.bsuir.task6;

public class Task6 {
    public static double[][] TransformMatrix(double[] array) {
        if (array.length == 0) {
            return new double[0][0];
        }

        int size = array.length;
        double[][] matrix = new double[size][size];

        System.arraycopy(array, 0, matrix[0], 0, size);
        for (int i = 1; i < size; i++) {
            System.arraycopy(matrix[i - 1], 1, matrix[i], 0, size - 1);
            matrix[i][size - 1] = matrix[i - 1][0];
        }

        return matrix;
    }
}
