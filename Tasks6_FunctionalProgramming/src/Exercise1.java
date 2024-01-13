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
        for(int i = 1; i < Math.max(a, b); i++) {
            if(a % i == 0 && b % i == 0 && i > gcd) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int getLcm(int a, int b, int gcd) {
        int[] aMultiples = new int[a];
        int[] bMultiples = new int[b];

        for(int i = 0; i < a; i++) {
            aMultiples[i] = i * a;
        }

        for(int i = 0; i < b; i++) {
            bMultiples[i] = i * b;
        }

        Arrays.sort(aMultiples);
        Arrays.sort(bMultiples);

        int lcm = 0;
        for(int i = 0; i < a; i++) {
            if(lcm != 0) {
                break;
            }
            for(int j = 0; j < b; j++) {
                if(aMultiples[i] == bMultiples[j]) {
                    lcm = aMultiples[i];
                    break;
                }
            }
        }

        return lcm;
    }
}

