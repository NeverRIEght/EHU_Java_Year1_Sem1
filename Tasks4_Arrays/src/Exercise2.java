public class Exercise2 {

    /**
     * Given a positive integer k and an integer array a,
     *
     * find the sum of the elements in array a that are multiples of k.
     *
     *
     * Format of an input line is k a, where elements of an array a are also separated with a space, see test data sets.
     * @param a the given array
     * @param k > 0 the given number
     * @return the sum of those elements of the array a that are multiples of the k
     */
    public static int getResult(int[] a, int k) {
        int outputSum = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % k == 0) {
                outputSum += a[i];
            }
        }

        return outputSum;
    }
}
