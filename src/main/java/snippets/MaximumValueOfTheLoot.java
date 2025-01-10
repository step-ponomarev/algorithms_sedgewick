package snippets;

// https://stepik.org/lesson/864345/step/1?unit=868430
public final class MaximumValueOfTheLoot {
    public static void main(String[] args) {
        System.out.println(
                getOptimalValue(50, new int[]{60, 100, 120}, new int[]{20, 50, 30})
        );
    }

    //TODO: чет тесты не проходим)
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        if (capacity == 0 || values.length == 0 || weights.length == 0) {
            return 0;
        }

        int maxIndex = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == Integer.MIN_VALUE || capacity - weights[i] < 0) {
                continue;
            }

            if (maxIndex == -1 || values[i] > values[maxIndex]) {
                maxIndex = i;
            }
        }

        if (maxIndex == -1) {
            return 0;
        }

        final int val = values[maxIndex];
        values[maxIndex] = Integer.MIN_VALUE;

        return val + getOptimalValue(capacity - weights[maxIndex], values, weights);
    }
}
