package org.example;

/**
 * https://stepik.org/lesson/862127/step/1?unit=866164
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(
                calcFib(0)
        );
    }

    private static long calcFib(int n) {
        if (n == 0) {
            return 0;
        }
        
        int f1 = 1;
        int fn = 1;
        
        for (int i = 2; i < n; i++) {
            int tmp = f1;
            f1 = fn;
            fn = f1 + tmp;
        }

        return fn;
    }
}