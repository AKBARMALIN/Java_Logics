package _21_string_manipulations;

public class _12_StringContainsOnlyDigits {

    // Method to check if the given CharSequence is null or empty
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.isEmpty();
    }

    // Method to check whether the given CharSequence contains only digits
    public static boolean isNumeric(CharSequence cs) {

        // If input is null or empty, return false
        if (isEmpty(cs)) {
            return false;
        }

        // Loop through each character of the input
        for(int i = 0; i < cs.length(); i++) {

            // Check if the current character is NOT a digit
            // Character.isDigit() returns true only for digits (0–9)
            if(!Character.isDigit(cs.charAt(i))) {
                return false; // If any character is not a digit, return false
            }
        }

        // If all characters are digits, return true
        return true;
    }

    public static void main(String[] args) {

        // Testing different input cases

        System.out.println(isNumeric(""));          // false → empty string
        System.out.println(isNumeric(" "));         // false → contains space
        System.out.println(isNumeric(null));        // false → null input
        System.out.println(isNumeric("a"));         // false → alphabet
        System.out.println(isNumeric("1"));         // true → single digit
        System.out.println(isNumeric("123"));       // true → multiple digits
        System.out.println(isNumeric("test123"));   // false → mixed characters
        System.out.println(isNumeric("1.2f"));      // false → contains dot and letter
        System.out.println(isNumeric("2.3"));       // false → contains dot
        System.out.println(isNumeric("+123"));      // false → contains '+'
        System.out.println(isNumeric("-123"));      // false → contains '-'
    }
}
