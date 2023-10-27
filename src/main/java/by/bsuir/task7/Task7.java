package by.bsuir.task7;

public class Task7 {
    public static double[] shellSort(double[] arr) {
        int currPos = 0;

        while (currPos != arr.length - 1) {
            if (arr[currPos] <= arr[currPos + 1]) {
                currPos++;
            } else {
                double temp = arr[currPos];
                arr[currPos] = arr[currPos + 1];
                arr[currPos + 1] = temp;
                currPos--;
            }
        }
        return arr;
    }
}
