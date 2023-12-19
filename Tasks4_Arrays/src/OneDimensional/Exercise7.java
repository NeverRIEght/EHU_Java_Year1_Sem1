package OneDimensional;

public class Exercise7 {

    /**
     * @param a the given array, a.length <= 30
     * @return the sum of elements of the array a whose indices are prime numbers
     */
    public static int getResult(int[] a) {

        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            if(i == 0 || i == 1) {
                continue;
            }

            boolean isPrime = true;
            for(int j = 2; j < i - 1; j++) {
                if(i % j == 0) {
                    isPrime = false;
                }
            }

            if(isPrime) {
                sum += a[i];
            }
        }
        return sum;
    }
}
