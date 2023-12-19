package TwoDimensional;

public class Exercise20 {
    /**
     * @param a a 2-dimensional array
     * @return the boolean array b, where b[i] is true
     * if the number 5 occurs at least three times in the row i
     */
    public static boolean[] create(int[][] a) {
        boolean[] b = new boolean[a.length];

        for(int i = 0; i < a.length; i++) {
            int counterOfFives = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 5) {
                    counterOfFives++;
                }
            }
            if (counterOfFives >= 3) {
                b[i] = true;
            }
        }

        return b;
    }
}
