package by.bsuir.task4;

import java.util.ArrayList;

public class Task4 {
    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        double sqrtNumber = Math.sqrt(number);

        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0)  {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> searchPrimeNumbers(int[] numbers) {
        ArrayList<Integer> primeNumberIndexes = new ArrayList<>(){};

        for (int i = 0; i < numbers.length; i++) {
            if (isPrimeNumber(numbers[i])) {
                primeNumberIndexes.add(i);
            }
        }

        return primeNumberIndexes;
    }
}
