package _09_FactorialNumber;

// Class to calculate factorial of a number using recursion
public class _05_Factorial_Recursive {

    // Method to calculate factorial recursively
    // Recursion is a technique where a method calls itself to solve smaller instances of the problem
    public static int factorialRecursive(int num) {
        // Base case: factorial of 0 is 1 (stopping condition for recursion)
        if(num == 0) {
            return 1;
        } else {
            // Recursive case: multiply num by factorial of (num - 1)
            // For example: 5! = 5 * 4! = 5 * 4 * 3! = 5 * 4 * 3 * 2! = 5 * 4 * 3 * 2 * 1! = 5 * 4 * 3 * 2 * 1 * 0! = 120
            return (num * factorialRecursive(num - 1));
        }
    }

    public static void main(String[] args) {
        // Test factorial of 0 (which should be 1)
        System.out.println("Factorial of 0 is: " + factorialRecursive(0));

        // Test factorial of 5 (which should be 120)
        System.out.println("Factorial of 5 is: " + factorialRecursive(5));
    }
}