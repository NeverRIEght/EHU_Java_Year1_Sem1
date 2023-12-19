package OneDimensional;

public class Exercise5 {

    /**
     * method swaps the largest and smallest elements of array a
     *
     * @param a the given array, all its elements are distinct
     */
    public static void swapMinAndMax(int[] a) {
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[minIndex] > a[i]) {
                minIndex = i;
            }
            if(a[maxIndex] < a[i]) {
                maxIndex = i;
            }
        }
        if(a[minIndex] != a[maxIndex]) {
            a[minIndex] = a[minIndex] ^ a[maxIndex];
            a[maxIndex] = a[maxIndex] ^ a[minIndex];
            a[minIndex] = a[minIndex] ^ a[maxIndex];
        }
    }
}
