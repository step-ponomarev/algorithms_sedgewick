package edu.sedgewick.algorithms.charapter_1;

public final class E_1_1_9_toBitStream {
    public static String toBitStream(int n) {
        final StringBuilder res = new StringBuilder();
        for (int i = 0; i < Integer.BYTES * 8; i++) {
            res.append(
                    (n >>> i) & 0b1
            );
        }

        return n >= 0 ? res.toString() : res.reverse().toString();
    }
}
