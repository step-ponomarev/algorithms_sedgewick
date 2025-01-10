package edu.sedgewick.algorithms.charapter_1;

public final class E_1_1_14_LG {
    public static int lg(int n) {
        if (n <= 0) {
            return 0;
        }

        int right = n;
        int left = 0;

        while (right >= left) {
            int curr = (right + left) >>> 1;
            int pov = curr * curr;

            if (pov > n) {
                right = curr - 1;
            }

            if (pov < n) {
                left = curr + 1;
            }

            if (pov == n) {
                return curr;
            }
        }

        return left == 0 ? 0 : left - 1;
    }
}
