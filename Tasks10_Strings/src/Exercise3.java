class Exercise3 {
    /** removes duplicate symbols in a string
     * @param str the given string
     * @return a string with duplicate characters removed
     */
    public static String removeDuplicateSymbols(String str) {
        StringBuilder output = new StringBuilder();
        int index = 0;

        for (int i = 0; i < str.length(); i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    break;
                }
            }

            if (j == i)
            {
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }
}