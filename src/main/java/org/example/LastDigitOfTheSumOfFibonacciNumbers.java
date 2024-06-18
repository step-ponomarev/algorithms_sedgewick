package org.example;

// https://stepik.org/lesson/862130/step/1?unit=866167
public final class LastDigitOfTheSumOfFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(getFibonacciSumNaive(100));
    }
    
    private static long getFibonacciSumNaive(long n) {
        return (LastDigitOfFibonacciNumber.getFibonacciLastDigitNaive((n + 2) % 60) + 9) % 10;
    }
}
