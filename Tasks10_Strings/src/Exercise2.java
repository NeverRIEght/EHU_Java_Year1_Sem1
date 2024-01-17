class Exercise2 {

    /** returns the number of digits in a string
     * @param str the given string
     * @return the number of digits in a string
     */
    public static int countDigitsInString(String str) {
        int digitsCount = 0;
        for(int i = str.length() - 1; i >= 0; i--) {
            try {
                Integer.parseInt(str.charAt(i) + "");
                digitsCount++;
            } catch (Exception ex) {
                continue;
            }
        }

        return digitsCount;
    }
}