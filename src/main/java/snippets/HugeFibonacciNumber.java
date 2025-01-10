package snippets;

public final class HugeFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(
                getFibonacciHugeNaive(2816213588L, 239)
        );
    }

    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1) {
            return n;
        }
        
        int amount = countPeriod(m);
        final long[] mods = new long[amount];
        mods[0] = 1 % m;
        mods[1] = 1 % m;

        for (int i = 2; i < mods.length; i++) {
            mods[i] = (mods[i - 1] + mods[i - 2]) % m;
        }

        final int i = (int) (n % mods.length) - 1;
        return mods[i < 0 ? mods.length + i : i];
    }

    private static int countPeriod(long m) {
        long a = 0;
        long b = 1;
        long c;

        for (int i = 0; i < m * m; i++) {
            c = (a + b) % m;
            a = b;
            b = c;
            
            if (a == 0 && b == 1) {
                return i + 1;
            }
        }
        
        throw new IllegalStateException("!!!Unreachable statement!!!");
    }
}
