package _21_string_manipulations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _20_StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        // Input string
        String str = "Testing";

        /*
         * Create a Pattern with "$"
         * "$" is a regex anchor that matches the END of the string
         */
        Matcher m = Pattern.compile("$").matcher(str);

        // Find the match (end position of the string)
        m.find();

        /*
         * m.end() returns the index position AFTER the match
         * Since "$" matches the end of the string,
         * m.end() gives the total length of the string
         */
        int length = m.end();

        // Print the calculated length
        System.out.println("Length of the string: " + length);
    }
}
