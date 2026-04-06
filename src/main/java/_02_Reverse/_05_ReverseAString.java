package _02_Reverse;

/**
 * This class contains a program to reverse a given string using a char array and a loop.
 */
public class _05_ReverseAString {

    public static void main(String[] args) {

        // Initialize the original string to be reversed
        String str = "malin";

        // Convert the string to a char array for character access
        char[] ch = str.toCharArray();
        String rev = "";

        // Loop from the last character index to the first
        for(int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }

        // Output the reversed string
        System.out.println("Reversed string: " + rev);
    }
}
