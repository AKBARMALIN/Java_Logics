package _02_Reverse;

import java.util.Scanner;

/**
 * This class contains a program to reverse a given number using StringBuilder.
 */
public class _02_ReverseANumber {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the integer input from the user
        int num = sc.nextInt();

        // Convert the number to a StringBuilder for easy reversal
        StringBuilder sb = new StringBuilder(String.valueOf(num));

        // Reverse the StringBuilder
        StringBuilder rev = sb.reverse();

        // Output the reversed number
        System.out.println("Reversed number: " + rev);
    }
}
