package _07_PrimeNumber;

import java.util.Scanner;

/**
 * This class provides functionality to check if a user-input number is prime.
 */
public class _01_PrimeNumberCheck {

    public static void main(String[] args) {

        // Create a Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to check if it is prime: ");

        // Read the number from user
        int num = sc.nextInt();

        // Initialize count of divisors
        int count = 0;

        // Check if number is greater than 1
        if(num > 1) {
            // Loop from 1 to num to count divisors
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }

            // If exactly 2 divisors, it's prime
            if(count == 2) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } else {
            // If not greater than 1, not prime
            System.out.println(num + " is not a prime number.");
        }
    }
}
