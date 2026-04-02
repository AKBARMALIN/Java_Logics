package _05_LargestNumber;

import java.util.Scanner;

/**
 * This class contains a program to find the largest among three given numbers.
 */
public class _01_FindLargestNumber {
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

        // Check if num1 is greater than both num2 and num3
        if(num1 > num2 && num1 > num3) {
            // Output num1 as the largest
            System.out.println("The largest number is: " + num1);
        } else if(num2 > num1 && num2 > num3) {
            // Output num2 as the largest
            System.out.println("The largest number is: " + num2);
        } else {
            // Output num3 as the largest (default case)
            System.out.println("The largest number is: " + num3);
        }
    }
}
