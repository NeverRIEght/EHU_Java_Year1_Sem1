public class Exercise2 {
    /**
     * method partially sorts an array by ascending order
     * with the insertion sort algorithm
     *
     * NOTE: Partially means that the first (k + 1) elements of the array
     * are ordered after k iterations.
     *
     * @param a the given array
     * @param k the given number of iterations, 0 < k < a.length
     */
    public static void sort(int[] a, int k) {
        for(int i = 1; i <= k; i++) {
            int currElem = a[i];
            int prevIndex = i - 1;
            while (prevIndex >= 0 && a[prevIndex] > currElem) {
                a[prevIndex + 1] = a[prevIndex];
                a[prevIndex] = currElem;
                prevIndex--;
            }
        }
    }
}
