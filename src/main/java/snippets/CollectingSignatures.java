package snippets;

import java.util.Arrays;
import java.util.Comparator;

// https://stepik.org/lesson/864350/step/2?unit=868434
public final class CollectingSignatures {
    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        int[] ints = optimalPoints(new Segment[]{new Segment(83, 91), new Segment(21, 50), new Segment(33, 70), new Segment(19, 44)});
    }

    private static int[] optimalPoints(Segment[] segments) {
        Arrays.sort(segments, Comparator.comparingInt(l -> l.end));
        
        final int[] list = new int[segments.length];
        int curI = 0;
        
        for (int i = 0; i < segments.length; i++) {
            if (i == 0) {
                list[curI++] = segments[i].end;
                continue;
            }

            if (segments[i].start > list[curI - 1]) {
                list[curI++] = segments[i].end;
            }
        }
        
        return Arrays.copyOf(list, curI);
    }
}
