package TwoDimensional;

public class Exercise14 {
    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        int[][] matrix1 = new int[n][n];

        int zerosCounter = n - 1;

        for(int i = 0; i < matrix1.length; i++) {
            for(int j = matrix1[i].length - 1; j >= 0; j--) {
                if(j >= n - zerosCounter) {
                    matrix1[i][j] = 0;
                } else {
                    matrix1[i][j] = n;
                }
            }
            zerosCounter--;
        }

        for(int i = 0; i < matrix1.length; i++) {
            for(int j = matrix1[i].length - 1; j >= 0; j--) {
                if(matrix1[i][j] != 0 && j != 0) {
                    matrix1[i][j - 1] = matrix1[i][j] - 1;
                } else if(j == 0) {
                    break;
                }
            }
        }

        return matrix1;
    }
}
