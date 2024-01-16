class Exercise2 {

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @param d the positive number.
     * @return their greatest common divisor
     */
    public static int getResult(int a, int b, int c, int d) {
        int gcd = 1;
        int max = Math.max(Math.max(Math.max(a, b), c), d);
        for(int i = 1; i <= max; i++) {
            if(a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0 && i > gcd) {
                gcd = i;
            }
        }
        return gcd;
    }

}
