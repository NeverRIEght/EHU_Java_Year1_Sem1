package TwoDimensional;

public class Exercise3 {
    /**
     * @param a m x n matrix, where n > 1
     * @return the m x 2 matrix containing the left and right columns of matrix a
     */
    public static int[][] create(int[][] a) {
        int[][] outputArray = new int[a.length][2];

        for(int i = 0; i < a.length; i++) {
            outputArray[i][0] = a[i][0];
            outputArray[i][1] = a[i][a[0].length - 1];
        }

        return outputArray;
    }
}
