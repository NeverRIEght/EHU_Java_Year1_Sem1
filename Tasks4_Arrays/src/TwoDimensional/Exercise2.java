package TwoDimensional;

public class Exercise2 {
    /**
     * @param a m x n matrix, where m > 1
     * @return the 2 x n matrix containing the top and bottom rows of matrix a
     */
    public static int[][] create(int[][] a) {
        int[][] outputArray = new int[2][a[0].length];

        for(int i = 0; i < a[0].length; i++) {
            outputArray[0][i] = a[0][i];
            outputArray[1][i] = a[a.length - 1][i];
        }

        return outputArray;
    }
}
