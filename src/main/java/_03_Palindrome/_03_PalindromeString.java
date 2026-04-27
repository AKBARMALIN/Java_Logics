package _03_Palindrome;

public class _03_PalindromeString {

    public static void main(String[] args) {

        // Input string
        String str = "NITIN";

        // Initialize two pointers:
        // 'start' at beginning, 'end' at last character
        int start = 0;
        int end = str.length() - 1;

        // Assume string is palindrome initially
        boolean isPalindrome = true;

        /*
         * Compare characters from both ends moving towards center
         */
        while(start < end) {

            // If characters at start and end are not equal
            if(str.charAt(start) != str.charAt(end)) {

                // Not a palindrome
                isPalindrome = false;

                // Exit loop early
                break;
            }

            // Move start pointer forward
            start++;

            // Move end pointer backward
            end--;
        }

        // Print result based on flag
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
