import java.util.Arrays;

class Exercise3 {

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @return their least common multiple
     */
    public static int getResult(int a, int b, int c) {
        return getLcm(getLcm(a, b), c);
    }

    public static int getLcm(int a, int b) {
        int[] aMultiples = new int[a];
        int[] bMultiples = new int[b];

        for(int i = 0; i < a; i++) {
            aMultiples[i] = (i + 1) * a;
        }

        for(int i = 0; i < b; i++) {
            bMultiples[i] = (i + 1) * b;
        }

        Arrays.sort(aMultiples);
        Arrays.sort(bMultiples);

        int lcm = a * b;
        for(int i = 0; i < a; i++) {
            if(lcm != a * b) {
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

