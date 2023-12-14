public class Exercise4 {

    /**
     * @param a the given array
     * @return the number of negative, zero, and positive elements in the array a
     */
    public static int[] getResult(int[] a) {
        int negative = 0;
        int zero = 0;
        int positive = 0;

        for (int element : a) {
            if(element > 0) {
                positive++;
            } else if(element < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        //do not change the next line
        return new int[] {negative, zero, positive};
    }
}
