package _21_string_manipulations;

public class _18_StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        // Input string
        String str = "Testing";

        /*
         * lastIndexOf("") returns the index of the empty string ("")
         * in the given string.
         *
         * In Java, an empty string is considered to be present
         * at every position, including the end of the string.
         *
         * So, lastIndexOf("") returns the position of the last occurrence,
         * which is equal to the length of the string.
         *
         * Example:
         * "Testing" → length = 7
         * lastIndexOf("") → 7
         */
        System.out.println("Length of the string: " + str.lastIndexOf(""));
    }
}
