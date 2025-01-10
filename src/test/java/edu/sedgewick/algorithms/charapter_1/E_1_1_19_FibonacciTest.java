package edu.sedgewick.algorithms.charapter_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class E_1_1_19_FibonacciTest {
    @Test
    public void baseTest() {
        for (int i = 0; i < 10; i++) {
            Assertions.assertEquals(F(i), E_1_1_19_Fibonacci.fibonacci(i));
        }
    }

    @Test
    public void simplePerformanceTest() {
        long slowRealisationTime = System.currentTimeMillis();
        int res1 = F(42);
        slowRealisationTime = System.currentTimeMillis() - slowRealisationTime;

        long fastRealisationTime = System.currentTimeMillis();
        int res2 = E_1_1_19_Fibonacci.fibonacci(42);
        fastRealisationTime = System.currentTimeMillis() - fastRealisationTime;

        Assertions.assertEquals(res1, res2);
        Assertions.assertTrue(slowRealisationTime > fastRealisationTime);
        System.out.println(slowRealisationTime + " _ " + fastRealisationTime);
    }

    //n^2
    private static int F(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return F(n - 1) + F(n - 2);
    }
}
