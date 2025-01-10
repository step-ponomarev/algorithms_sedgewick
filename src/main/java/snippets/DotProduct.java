package snippets;

// https://stepik.org/lesson/864348/step/2?unit=868433
public final class DotProduct {
    private static long maxDotProduct(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) {
            return 0;
        }

        int i1 = -1;
        int j1 = -1;
        for (int i = 0; i < a.length; i++) {
            if (i1 == -1 && a[i] != Integer.MIN_VALUE) {
                i1 = i;
            } else if (i1 != -1 && a[i1] < a[i]) {
                i1 = i;
            }

            if (j1 == -1 && b[i] != Integer.MIN_VALUE) {
                j1 = i;
            } else if (j1 != -1 && b[j1] < b[i]) {
                j1 = i;
            }
        }

        if (i1 == -1 || j1 == -1) {
            return 0;
        }

        long val = (long) a[i1] * b[j1];
        a[i1] = Integer.MIN_VALUE;
        b[j1] = Integer.MIN_VALUE;

        return val + maxDotProduct(a, b);
    }
}
