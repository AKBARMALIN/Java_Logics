package _21_string_manipulations;

public class _25_RemoveWhiteSpaces {

    public static void main(String[] args) {

        // Input string with spaces
        String str = "java with spring boot";

        // Print original string
        System.out.println("Before removing white spaces: " + str);

        /*
         * replaceAll("\\s", "")
         * "\\s" is a regular expression that matches all whitespace characters:
         * - space
         * - tab
         * - newline, etc.
         *
         * It replaces all whitespace characters with an empty string ""
         */
        str = str.replaceAll("\\s", "");

        // Print string after removing all whitespace
        System.out.println("After removing white spaces: " + str);
    }
}
