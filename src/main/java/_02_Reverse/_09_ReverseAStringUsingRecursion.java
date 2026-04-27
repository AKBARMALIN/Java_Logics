package _02_Reverse;

public class _09_ReverseAStringUsingRecursion {

    public static void main(String[] args) {

        // Input string
        String str = "Hello, World!";

        // Call recursive method to reverse the string
        String reversedStr = reverseString(str);

        // Print original and reversed strings
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    // Recursive method to reverse a string
    public static String reverseString(String str) {

        /*
         * Base condition:
         * If string is null OR length is 0 or 1,
         * return the string itself (no reversal needed)
         */
        if(str == null || str.length() <= 1) {
            return str;
        }

        /*
         * Recursive case:
         * 1. Call reverseString() on substring excluding first character
         *    Example: "Hello" → "ello"
         *
         * 2. Add first character at the end
         *    Example: reverse("ello") + 'H'
         */
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
