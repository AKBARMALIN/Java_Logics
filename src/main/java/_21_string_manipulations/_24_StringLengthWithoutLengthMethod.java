package _21_string_manipulations;

public class _24_StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        // Input string
        String str = "Software Testing";

        // Variable to store length
        int length = 0;

        try {

            /*
             * Convert the string into bytes using UTF-16BE encoding.
             * In UTF-16BE, each character typically takes 2 bytes.
             * So, total bytes = number of characters * 2
             */
            length = str.getBytes("UTF-16BE").length / 2;

        } catch(Exception e) {
            // Exception handling (kept empty, but ideally should log or print error)
        }

        // Print the calculated length of the string
        System.out.println("Length of the string: " + length);
    }
}
