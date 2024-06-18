package org.example;

// https://stepik.org/lesson/864347/step/2?unit=868432
public final class CarFueling {
    public static void main(String[] args) {
        System.out.println(computeMinRefills(950, 400, new int[]{
                200, 375, 550, 750
        }));
    }

    private static int computeMinRefills(final int dist, int tank, int[] stops) {
        final int fullTank = tank;

        int prev = 0;
        int count = 0;
        for (int i = 0; i < stops.length; i++) {
            tank -= (stops[i] - prev);
            
            int next = (stops.length - 1 == i) ? dist : stops[i + 1];
            if (next - stops[i] > fullTank) {
                return -1;
            }
            
            if (next - stops[i] > tank) {
                count++;
                tank = fullTank;
            }
            
            prev = stops[i];
        }
        
        return count;
    }
}
