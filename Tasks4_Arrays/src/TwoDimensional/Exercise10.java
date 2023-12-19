package TwoDimensional;

public class Exercise10 {
    /**
     * @param a 2-dimensional array, where the number of elements in each row is greater than 1
     * @return the m x 2 matrix containing the left and right elements
     * of each row of an array a, where m is the number of rows of an array A.
     */
    public static int[][] create(int[][] a) {
        int[][] result = new int[a.length][2];

        for(int i = 0; i < a.length; i++) {
            result[i][0] = a[i][0];
            result[i][1] = a[i][a[i].length - 1];
        }

        return result;
    }
}
