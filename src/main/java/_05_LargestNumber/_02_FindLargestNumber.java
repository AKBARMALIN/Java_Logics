package _05_LargestNumber;

import java.util.Scanner;

/**
 * This class contains a program to find the largest among three given numbers using a ternary operator.
 */
public class _02_FindLargestNumber {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first Number: ");
        // Read the first integer input
        int num1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second Number: ");
        // Read the second integer input
        int num2 = sc.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the third Number: ");
        // Read the third integer input
        int num3 = sc.nextInt();

        // Use nested ternary operators to find the largest number
        // First check if num1 is greater than num2 and num3, if true return num1
        // Otherwise check if num2 is greater than num1 and num3, if true return num2
        // Otherwise return num3 (which is the largest)
        int largest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;

        // Output the largest number
        System.out.println("The largest number is: " + largest);
    }
}
