package TwoDimensional;

public class Exercise23 {
    /**
     * sorts the matrix by ascending of the initial element of each row
     * @param a m x n matrix, initial elements of each row are distinct
     */
    public static void sortedByInitial(int[][] a) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(i + 1 < a.length && a[i][0] > a[i + 1][0]){
                    isSorted = false;

                    int[] temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
