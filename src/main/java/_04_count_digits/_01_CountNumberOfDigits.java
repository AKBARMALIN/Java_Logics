package _04_count_digits;

import java.util.Scanner;

/**
 * This class contains a program to count the number of digits in a given number.
 */
public class _01_CountNumberOfDigits {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Read the integer input from the user
        int num = sc.nextInt();

        // Initialize a counter for the number of digits
        int count = 0;

        // Loop until the number becomes 0
        while(num != 0) {
            // Divide the number by 10 to remove the last digit
            num = num / 10;
            // Increment the count for each digit removed
            count++;
        }

        // Output the number of digits
        System.out.println("The number of digits is: " + count);
    }
}
