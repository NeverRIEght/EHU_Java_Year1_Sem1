class Exercise3 {
    /**
     * method partially sorts an array by ascending order
     * with the bubble sort algorithm
     *
     * NOTE: Partially means that the bubble sort algorithm ends
     * after the earlier of two possible events:
     * 1) the array is sorted, 2) k swaps are done.
     *
     * @param a the given array
     * @param k the given number of swaps, k > 0
     */
    public static void sort(int[] a, int k) {
        for(int n = 0; n < a.length; n++) {
            int i = 0;
            int j = 1;

            while (i < a.length - 1 && j < a.length && k != 0) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    k--;
                }
                i++;
                j++;
            }
        }
    }
}
