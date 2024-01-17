import java.util.Arrays;

class Exercise1 {

    /** method returns string with the reversed sequence of characters
     * @param str the given string
     * @return the reversed string
     */
    public static String reverse(String str) {
        char[] output = new char[str.length()];

        int lastChar = 0;
        for(int i = str.length() - 1; i >= 0; i--) {
            output[lastChar] = str.charAt(i);
            lastChar++;
        }

        String outputStr = Arrays.toString(output).replace("[", "").
                replace("]", "").replace(", ", "");

        return outputStr;
    }
}