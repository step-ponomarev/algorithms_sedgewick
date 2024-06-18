package org.example;

// https://stepik.org/lesson/864344/step/1?unit=868429
public final class MoneyChange {
    public static void main(String[] args) {
        System.out.println(getChange(11));
    }
    
    private static int getChange(int m) {
        final int [] nominals = new int[] {10, 5, 1};
        int curNominal = 0;
        int amount = 0;
        int sum = 0;
        
        while (sum != m) {
            final int diff = m - sum;
            while (diff < nominals[curNominal]) {
                curNominal++;
            }

            sum += nominals[curNominal];
            amount++;
        }
        
        return amount;
    }
}
