class Exercise4 {
    /**
     * generates a sequence of numbers
     *
     * @param start initial value of the number
     * @param count number of numbers in sequence
     * @return generated sequence of numbers
     */
    public static String generateNumberSequence(int start, int count) {
        StringBuilder outputBuilder = new StringBuilder();

        for(int i = start; i < count + start; i++) {
            outputBuilder.append(i);
            outputBuilder.append(" ");
        }

        if(outputBuilder.length() > 1) {
            outputBuilder = new StringBuilder(outputBuilder.substring(0, outputBuilder.length() - 1));
        }

        return "(" + outputBuilder.toString() + ")";
    }
}