import java.util.Arrays;
class Exercise1 {

    /**
     * @param x the positive number.
     * @param y the positive number.
     * @return their greatest common divisor and the least common multiple
     */
    public static int[] getResults(int x, int y) {
        int gcd = euclid(x, y);
        int lcm = getLcm(x, y, gcd);
        return new int[]{gcd, lcm};
    }

    private static int euclid(int a, int b) {
        int gcd = 1;
        int max = Math.max(a, b);
        for(int i = 2; i <= max; i++) {
            if(a % i == 0 && b % i == 0 && i > gcd) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int getLcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}

