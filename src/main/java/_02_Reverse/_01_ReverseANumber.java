package _02_Reverse;

import java.util.Scanner;

/**
 * This class contains a program to reverse a given number.
 */
public class _01_ReverseANumber {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the integer input from the user
        int num = sc.nextInt();

        // Initialize the reversed number variable to 0
        int rev = 0;

        // Loop while the number is not zero
        while(num != 0) {
            // Calculate the reversed number by adding the last digit
            rev = rev * 10 + num % 10;
            // Remove the last digit from the original number
            num = num / 10;
        }

        // Output the reversed number
        System.out.println("Reversed number: " + rev);
    }
}
