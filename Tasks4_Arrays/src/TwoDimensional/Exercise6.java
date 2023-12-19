package TwoDimensional;

public class Exercise6 {
    /**
     * @param a m x n matrix
     * @return the array from elements of the matrix in the following order:
     * the row 0 from right to left,
     * the row 1 from left to right,
     * the row 2 from right to left, and so on
     */
    public static int[] straighten(int[][] a) {
        int[] outputArr = new int[a.length * a[0].length];

        int outputArrIndex = 0;
        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                for(int j = a[0].length; j > 0; j--) {
                    outputArr[outputArrIndex] = a[i][j - 1];
                    outputArrIndex++;
                }
            } else {
                for(int j = 0; j < a[0].length; j++) {
                    outputArr[outputArrIndex] = a[i][j];
                    outputArrIndex++;
                }
            }
        }

        return outputArr;
    }
}
