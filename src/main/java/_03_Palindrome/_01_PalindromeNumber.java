package _03_Palindrome;

import java.util.Scanner;

/**
 * This class contains a program to check if a given number is a palindrome.
 */
public class _01_PalindromeNumber {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the integer input from the user
        int num = sc.nextInt();

        // Store the original number for comparison later
        int originalNum = num;

        // Initialize the reversed number to 0
        int rev = 0;

        // Loop to reverse the number
        while(num != 0) {
            // Calculate the reversed number by adding the last digit
            rev = rev * 10 + num % 10;

            // Remove the last digit from the original number
            num = num / 10;
        }

        // Check if the reversed number equals the original number
        if (rev == originalNum) {
            // Output that it is a palindrome
            System.out.println("Palindrome");
        } else {
            // Output that it is not a palindrome
            System.out.println("Not a palindrome");
        }
    }
}
