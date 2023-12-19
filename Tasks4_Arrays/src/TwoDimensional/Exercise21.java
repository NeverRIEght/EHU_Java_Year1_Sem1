package TwoDimensional;

public class Exercise21 {
    /**
     * @param a a 2-dimensional array
     * @return the number of two-digit numbers in the array
     */
    public static int numberOfTwoDigits(int[][] a) {
        int countOfTwoDigits = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(Math.abs(a[i][j]) >= 10 && Math.abs(a[i][j]) <= 99) {
                    countOfTwoDigits++;
                }
            }
        }

        return countOfTwoDigits;
    }
}
