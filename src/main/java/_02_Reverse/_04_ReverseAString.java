package _02_Reverse;

/**
 * This class contains a program to reverse a given string using a loop.
 */
public class _04_ReverseAString {

    public static void main(String[] args) {

        // Initialize the original string to be reversed
        String str = "akbar";

        String rev = "";

        // Loop from the last character index to the first
        for(int i = str.length() - 1; i >=0; i--) {
           // Append each character from the end to the beginning to the reversed string
           rev = rev + str.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed string: " + rev);
    }
}
