package TwoDimensional;

public class Exercise16 {
    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     * 1 2 … n-1 n
     * n+1 n+2 … 2n-1 2n
     * 2n+1 2n+2 … 3n-1 3n
     * … … … … …
     * (n-1)n+1 (n-1)n+2 … n2-1 n2
     */
    public static int[][] create(int n) {
        int[][] matrix1 = new int[n][n];

        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                if(i == 0) {
                    matrix1[i][j] = j + 1;
                } else {
                    matrix1[i][j] = i * n + j + 1;
                }
            }
        }

        return matrix1;
    }
}
