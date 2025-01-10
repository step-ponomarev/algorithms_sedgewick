package snippets;

import java.util.Arrays;

// https://stepik.org/lesson/864352/step/1?unit=868436
public final class LargestNumber {
    public static void main(String[] args) {
        System.out.println(largestNumber(new String[]{"4444", "46"}));
    }

    private static String largestNumber(String[] a) {
        Arrays.sort(a, (l, r) -> (Integer.parseInt(r + l) - Integer.parseInt(l + r)));

        return String.join("", a);
    }
}
