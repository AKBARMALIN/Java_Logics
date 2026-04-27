package _21_string_manipulations;

public class _23_StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        // Input string
        String str = "Testing";

        // Calling custom method to calculate length without using length()
        System.out.println("Length of the string: " + getLength(str));
    }

    // Method to calculate string length without using length() directly
    public static int getLength(String str) {

        // Split the string into an array of single characters
        // Example: "Testing" -> ["T", "e", "s", "t", "i", "n", "g"]
        String[] st = str.split("");

        // Variable to count total characters
        int count = 0;

        // Loop through each character (as string)
        for(String s : st) {

            /*
             * Convert each character string into a char array
             * Each element contains only one character,
             * so s.toCharArray().length will always be 1
             */
            count += s.toCharArray().length;
        }

        // Return the total count (length of string)
        return count;
    }
}
