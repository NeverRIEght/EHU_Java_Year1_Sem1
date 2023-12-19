package TwoDimensional;

public class Exercise18 {
    /**
     * @param a m x n matrix, n > 0
     *          all elements of the matrix are distinct.
     * @return column which contains the maximum value of the matrix
     */
    public static int columnOfMax(int[][] a) {

        int max = a[0][0];
        int column = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] > max) {
                    max = a[i][j];
                    column = j;
                }
            }
        }

        return column;
    }
}
