package _02_Reverse;

public class _08_ReverseEachWordInAString {

    public static void main(String[] args) {

        // Original input string
        String str = "WELCOME TO SELENIUM";

        // Split the string into words based on space
        // \\s represents whitespace
        String[] words = str.split("\\s");

        // This will store the final reversed string
        String reverseString = "";

        // Loop through each word in the array
        for(String word : words) {

            // Create StringBuilder object for the current word
            // StringBuilder is used because it provides built-in reverse() method
            StringBuilder sb = new StringBuilder(word);

            // Reverse the current word
            sb.reverse();

            // Append reversed word to result string with space
            reverseString = reverseString + sb.toString() + " ";
        }

        // Print original string
        System.out.println("Original String: " + str);

        // trim() removes extra space at the end of the final string
        System.out.println("Reversed String: " + reverseString.trim());
    }
}
