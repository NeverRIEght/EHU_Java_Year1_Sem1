public class Exercise10 {

    /**
     * @param a the given array, containing an even number of elements
     * @return max(a[0] + a[n - 1], ..., a[n/2 - 1] + a[n/2])
     */
    public static int getResult(int[] a) {
        int max = a[0] + a[a.length - 1];
        for(int i = 0; i < a.length / 2; i++) {
            if(a[i] + a[a.length - 1 - i] > max) {
                max = a[i] + a[a.length - 1 - i];
            }
        }

        return max;
    }
}
