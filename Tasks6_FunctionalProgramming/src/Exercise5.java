class Exercise5 {

    /**
     * @param a the given array, at least 2 distinct numbers
     * @return the second-largest number in the array,
     * i.e. the number that is less than the maximum element of the array,
     * but not less than all other elements, if any.
     */
    public static int secondLargest(int[] a) {
        int max;
        int premax;
        if(a[0] >= a[1]) {
            max = a[0];
            premax = a[1];
        } else {
            max = a[1];
            premax = a[0];
        }
        for(int i = 0; i < a.length; i++) {
            if(premax < a[i] && a[i] < max) {
                premax = a[i];
            }
            if(a[i] > max) {
                int temp = max;
                max = a[i];
                premax = temp;
            }
        }
        return premax;
    }
}