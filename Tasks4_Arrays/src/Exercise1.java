public class Exercise1 {
    /**
     * @param a the given array
     * @param k > 0 the given number
     * @return an array containing the first k positive elements of the array a
     */
    public static int[] getResult(int[] a, int k) {
        int[] outputArray = new int[k];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && count < k) {
                outputArray[count] = a[i];
                count++;
            }
        }
        return outputArray;
    }
}
