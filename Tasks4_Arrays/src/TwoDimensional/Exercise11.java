package TwoDimensional;

public class Exercise11 {
    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        int[][] matrix = new int[n][n];

        int zerosCounter = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - zerosCounter; j++) {
                matrix[i][j] = i + 1;
            }
            for(int j = n - zerosCounter; j < n; j++) {
                matrix[i][j] = 0;
            }
            zerosCounter++;
        }

        return matrix;
    }
}
