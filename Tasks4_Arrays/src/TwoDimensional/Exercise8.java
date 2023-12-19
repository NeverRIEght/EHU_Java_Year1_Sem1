package TwoDimensional;

public class Exercise8 {
    /**
     * @param n the given positive number
     * @return the bottom triangle 2 dimensional array with n rows filled with 1
     */
    public static int[][] create(int n) {
        int[][] matrix = new int[n][];

        for(int i = 0; i < n; i++) {
            matrix[i] = new int[i + 1];
            for(int j = 0; j <= i; j++) {
                matrix[i][j] = 1;
            }
        }

        return matrix;
    }
}
