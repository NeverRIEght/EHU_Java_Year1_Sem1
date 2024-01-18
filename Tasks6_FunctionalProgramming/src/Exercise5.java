import java.util.Arrays;

class Exercise5 {

    /**
     * @param a the given array, at least 2 distinct numbers
     * @return the second-largest number in the array,
     * i.e. the number that is less than the maximum element of the array,
     * but not less than all other elements, if any.
     */
    public static int secondLargest(int[] a) {
        Arrays.sort(a);

        int max = a[a.length - 1];
        int premax = a[a.length - 2];

        for(int i = a.length - 2; i >= 0; i--) {
            if(a[i] < max) {
                premax = a[i];
                break;
            }
        }

        return premax;
    }
}