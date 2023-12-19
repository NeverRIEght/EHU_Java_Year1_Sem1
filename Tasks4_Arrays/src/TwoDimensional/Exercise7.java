package TwoDimensional;

public class Exercise7 {
    /**
     * @param n the given positive number
     * @return the square bottom triangle n x n matrix filled with 1
     */
    public static int[][] create(int n) {
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }
}
