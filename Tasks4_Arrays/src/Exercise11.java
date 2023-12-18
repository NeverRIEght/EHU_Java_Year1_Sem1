public class Exercise11 {

    /**
     * @param a the given array
     * @return the number of elements of the array a
     * that are greater than the minimum element of the array a
     */
    public static int getResult(int[] a) {
        int min = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }

        int countOfAppropriateElements = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > min) {
                countOfAppropriateElements++;
            }
        }

        return countOfAppropriateElements;
    }
}
