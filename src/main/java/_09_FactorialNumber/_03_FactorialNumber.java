package _09_FactorialNumber;

// Class to calculate factorial of a number using a method with loop iteration
public class _03_FactorialNumber {
    
    // Method to calculate factorial of a given number
    // Parameter: num - the number for which factorial needs to be calculated
    // Return: integer value representing the factorial of num
    public static int factorial(int num) {
        // Initialize fact variable to 1 (multiplicative identity)
        int fact = 1;
        
        // Check if the input number is 0 (base case)
        // Factorial of 0 is defined as 1
        if (num == 0) {
            return 1;
        }

        // Traditional for loop to iterate from 1 to num (inclusive)
        for(int i = 1; i <= num; i++) {
            // Multiply the current fact value with the loop counter i
            // For example: 5! = 1 * 1 * 2 * 3 * 4 * 5 = 120
            fact = fact * i;
        }
        
        // Return the calculated factorial result
        return fact;
    }

    public static void main(String[] args) {
        // Test factorial of 0 (which should be 1)
        System.out.println("Factorial of 0 is: " + factorial(0));

        // Test factorial of 5 (which should be 120)
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
}
