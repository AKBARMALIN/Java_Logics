package _03_Palindrome;

import java.util.Scanner;

/**
 * This class contains a program to check if a given string is a palindrome.
 */
public class _02_PalindromeString {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");

        // Read the string input from the user
        String str = sc.nextLine();

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Check if the original string equals the reversed string
        if(str.contentEquals(rev)) {
            // Output that it is a palindrome
            System.out.println("The string is a palindrome.");
        } else {
            // Output that it is not a palindrome
            System.out.println("The string is not a palindrome.");
        }
    }
}
