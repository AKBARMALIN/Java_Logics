package _21_string_manipulations;

public class _17_StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        // Input string
        String str = "Testing";

        /*
         * Convert the string into a character array using toCharArray()
         * Example: "Testing" -> ['T', 'e', 's', 't', 'i', 'n', 'g']
         *
         * Then get the length of the array
         * Array length = number of characters in the string
         */
        System.out.println("Length of the string: " + str.toCharArray().length);
    }
}
