package TwoDimensional;

public class Exercise15 {
    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        int[][] matrix1 = new int[n][n];

        for(int i = matrix1.length - 1; i >= 0; i--) {
            int counter = 0;
            for(int j = matrix1.length - 1 - i; j >= 0; j--) {
                matrix1[i][j] = n - counter;
                counter++;
            }
        }

        return matrix1;
    }
}
