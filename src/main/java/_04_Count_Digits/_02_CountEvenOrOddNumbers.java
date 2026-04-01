package _04_Count_Digits;

import java.util.Scanner;

/**
 * This class contains a program to count the number of even and odd digits in a given number.
 */
public class _02_CountEvenOrOddNumbers {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Read the integer input from the user
        int num = sc.nextInt();

        // Initialize counters for even and odd digits
        int evenCount = 0;
        int oddCount = 0;

        // Loop until the number becomes 0
        while(num != 0) {
            // Extract the last digit of the number
            int digit = num % 10;
            // Check if the digit is even
            if(digit % 2 == 0) {
                // Increment the even count
                evenCount++;
            } else {
                // Increment the odd count
                oddCount++;
            }
            // Remove the last digit from the number
            num = num / 10;
        }

        // Output the counts of even and odd digits
        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
    }
}
