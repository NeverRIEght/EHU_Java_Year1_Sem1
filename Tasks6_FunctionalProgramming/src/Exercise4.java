class Exercise4 {

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @return whether they are coprime
     */
    public static boolean areCoprime(int a, int b, int c) {
        return getGCD(a, b, c) == 1;
    }

    private static int getGCD(int a, int b, int c) {
        int gcd = 1;
        int max = Math.max(Math.max(a, b), c);
        for(int i = 2; i <= max; i++) {
            if(a % i == 0 && b % i == 0 && c % i == 0 && i > gcd) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int[][] sets = new int[7][3];
        sets[0] = new int[] {12, 25, 77};
        sets[1] = new int[] {420, 355, 63};
        sets[2] = new int[] {3, 4, 1};
        sets[3] = new int[] {3, 2, 3};
        sets[4] = new int[] {7, 7, 7};
        sets[5] = new int[] {7, 1, 49};
        sets[6] = new int[] {1, 1, 1};

        for(int i = 0; i < 7; i++) {
            int a = sets[i][0];
            int b = sets[i][1];
            int c = sets[i][2];

            System.out.println(i + 1 + ". " + (getGCD(a, b, c) == 1));
        }
    }
}
