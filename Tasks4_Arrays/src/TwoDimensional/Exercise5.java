package TwoDimensional;

public class Exercise5 {
    /**
     * @param a n x n matrix
     * @return the array from elements located on the main diagonal of the matrix
     */
    public static int[] diagonal(int[][] a) {
        int[] diagonalElems = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            diagonalElems[i] = a[i][i];
        }

        return diagonalElems;
    }
}
