package snippets;

import java.util.HashMap;
import java.util.Map;

// https://stepik.org/lesson/864366/step/1?unit=868447
public final class BinarySearch {
    private static final Map<Integer, Integer> VALUE_TO_INDEX = new HashMap<>();

    public static void main(String[] args) {
        final int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(
                binarySearch(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, 8)
        );
    }

    private static int binarySearch(int[] a, int x) {
        if (a[0] == x) {
            return 0;
        }

        if (a[a.length - 1] == x) {
            return a.length - 1;
        }

        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (a[mid] == x) {
                return mid;
            }


            if (a[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
