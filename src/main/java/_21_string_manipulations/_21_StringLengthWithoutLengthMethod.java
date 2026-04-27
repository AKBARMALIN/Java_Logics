package _21_string_manipulations;

public class _21_StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        // Input string
        String str = "Testing";

        // Variable to store the length of the string
        int length = 0;

        /*
         * Convert the string into a character array using toCharArray()
         * Then iterate through each character using enhanced for-loop
         */
        for (char c : str.toCharArray()) {

            // Increment counter for each character
            length++;
        }

        // Print the calculated length
        System.out.println("Length of the string: " + length);
    }
}
