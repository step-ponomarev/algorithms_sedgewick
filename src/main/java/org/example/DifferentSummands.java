package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://stepik.org/lesson/864351/step/1?unit=868435
public final class DifferentSummands {
    public static void main(String[] args) {
        List<Integer> integers = optimalSummands(6);
    }

    private static List<Integer> optimalSummands(int n) {
        if (n <= 2) {
            return Collections.singletonList(n);
        }

        final List<Integer> summands = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n - (sum + i) <= i) {
                summands.add(n - sum);
                break;
            }

            sum += i;
            summands.add(i);
        }

        return summands;
    }
}
