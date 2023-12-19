package TwoDimensional;

public class Exercise4 {
    /**
     * @param a m x n matrix
     * @return the matrix containing even rows of the matrix a
     */
    public static int[][] create(int[][] a) {
        int outputLength;

        if(a.length % 2 != 0) {
            outputLength = a.length / 2 + 1;
        } else {
            outputLength = a.length / 2;
        }

        int[][] output = new int[outputLength][];

        int lastFreeIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                output[lastFreeIndex] = a[i];
                lastFreeIndex++;
            }
        }

        return output;
    }
}
