package edu.sedgewick.algorithms.charapter_1;

public final class E_1_1_19_Fibonacci {

    // n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int f1 = 1;
        int fn = 1;
        for (int i = 2; i < n; i++) {
            int tmp = f1;
            f1 = fn;
            fn = tmp + fn;
        }

        return fn;
    }
}
