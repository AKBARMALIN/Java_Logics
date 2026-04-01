package _02_Reverse;

/**
 * This class contains a program to reverse a given string using StringBuilder.
 */
public class _06_ReverseAString {
    public static void main(String[] args) {

        // Initialize the original string to be reversed
        String str = "akbar";

        // Create a StringBuilder with the string for reversal
        StringBuilder sb = new StringBuilder(str);

        // Reverse the StringBuilder
        StringBuilder rev = sb.reverse();

        // Output the reversed string
        System.out.println("Reversed string: " + rev);

    }
}
