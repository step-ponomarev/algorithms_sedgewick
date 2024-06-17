package org.example;

// https://stepik.org/lesson/862128/step/1?unit=866165
public final class LastDigitOfFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(
                getFibonacciLastDigitNaive(1)
        );
    }
    
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previousEnd = 0;
        int currentEnd  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp = previousEnd;
            previousEnd = currentEnd;
            currentEnd = (tmp + currentEnd) % 10;
        }

        return currentEnd;
    }
}
