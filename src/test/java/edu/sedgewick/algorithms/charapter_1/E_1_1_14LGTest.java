package edu.sedgewick.algorithms.charapter_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class E_1_1_14LGTest {
    @Test
    public void test() {
        for (int i = 0; i < 20_000; i++) {
            Assertions.assertEquals((int) Math.sqrt(i), E_1_1_14_LG.lg(i));
        }
    }
}
