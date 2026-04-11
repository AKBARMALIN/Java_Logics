package _02_Reverse;

public class _07_ReverseEachWordInAString {

    public static void main(String[] args) {

        // Original input string
        String str = "WELCOME TO JAVA";

        // Split the string into words using space as delimiter
        String[] words = str.split(" ");

        // Variable to store the final reversed string
        String reverseString = "";

        // Loop through each word in the string
        for(String word : words) {

            // Variable to store reversed version of each word
            String reverseWord = "";

            // Loop through each character of the word in reverse order
            for(int  i = word.length() - 1; i >= 0; i--) {

                // Append characters in reverse order to reverseWord
                reverseWord = reverseWord + word.charAt(i);
            }

            // Append the reversed word to the final string with a space
            reverseString = reverseString + reverseWord + " ";
        }

        // Print original string
        System.out.println("Original String: " + str);

        // trim() removes the extra space at the end of the reversed string
        System.out.println("Reversed String: " + reverseString.trim());
    }
}
