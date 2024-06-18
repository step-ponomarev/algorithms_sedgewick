package org.example;

// https://stepik.org/lesson/862128/step/1?unit=866165
public final class LastDigitOfFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(
                getFibonacciLastDigitNaive(1)
        );
    }
    
    protected static long getFibonacciLastDigitNaive(long n) {
        if (n <= 1)
            return n;

        long previousEnd = 0;
        long currentEnd  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp = previousEnd;
            previousEnd = currentEnd;
            currentEnd = (tmp + currentEnd) % 10;
        }

        return currentEnd;
    }
}
