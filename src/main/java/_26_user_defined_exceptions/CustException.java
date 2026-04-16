package _26_user_defined_exceptions;

import java.util.Scanner;

/*
   Sometimes to meet programming requirements we can define our own exceptions.
   such type of exceptions are called customized or used defined exceptions.
 */
public class CustException {

    public static void main(String[] args) {

        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        // Ask user to enter age
        System.out.println("Enter your age: ");

        // Read integer input
        int age = sc.nextInt();

        // Business logic based on age
        if(age > 60) {
            // If age is greater than 60, throw custom exception
            throw new TooYoungException("Please wait some more time... you will get the bast match soon");
        } else if(age < 18) {
            // If age is less than 18, throw another custom exception
            throw new TooOldException("Your age is already crossed marriage age... no chance of getting marriage");
        } else {
            // If age is between 18 and 60, print success message
            System.out.println("You will get best match soon by email...!");
        }

        // Close scanner
        sc.close();
    }
}
