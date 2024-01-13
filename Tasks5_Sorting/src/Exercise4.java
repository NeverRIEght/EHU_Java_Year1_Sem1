class Exercise4 {
    /**
     * method sorts two non-empty arrays of equal length parallelly by ascending order
     * (first sort by letters, and if elements of the array letters are equal,
     * then sort by numbers).
     *
     * @param letters the given array
     * @param numbers the given array
     */
    public static void sort(char[] letters, int[] numbers) {
        for(int i = 0; i < letters.length; i++) {
            for(int j = 1; j < letters.length; j++) {
                int tmp;
                if(letters[j] < letters[j - 1]) {
                    tmp = letters[j - 1];
                    letters[j - 1] = letters[j];
                    letters[j] = (char) tmp;

                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                } else if(letters[j] == letters[j - 1]) {
                    if(numbers[j] < numbers[j - 1]) {
                        tmp = numbers[j - 1];
                        numbers[j - 1] = numbers[j];
                        numbers[j] = tmp;
                    }
                }
            }
        }
    }
}

