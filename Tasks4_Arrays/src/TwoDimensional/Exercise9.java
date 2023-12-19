package TwoDimensional;

public class Exercise9 {
    /**
     * @param a the given array, containing non-negative numbers
     * @return the 2-dimensional array b where for each i: a[i] is the length of b[i] and b[i][j] = j
     */
    public static int[][] create(int[] a) {
        int[][] outputArray = new int[a.length][];

        for(int i = 0; i < a.length; i++) {
            outputArray[i] = new int[a[i]];

            for(int j = 0; j < a[i]; j++) {
                outputArray[i][j] = j;
            }
        }

        return outputArray;
    }
}
