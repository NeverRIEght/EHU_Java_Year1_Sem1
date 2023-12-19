package OneDimensional;

public class Exercise3 {

    /**
     * method replaces all elements of a that greater than m with m
     *
     * @param a the given array
     * @param m the given number
     * @return the number of replacements
     */
    public static int getResult(int[] a, int m) {
        int numberOfReplacements = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                a[i] = m;
                numberOfReplacements++;
            }
        }

        return numberOfReplacements;
    }
}
