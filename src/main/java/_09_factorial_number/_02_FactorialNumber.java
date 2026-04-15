package _09_factorial_number;

// Class to calculate factorial of a number using loop iteration
public class _02_FactorialNumber {

    public static void main(String[] args) {
        // Initialize the number for which we want to calculate factorial
        int num = 6;

        // Initialize factorial variable with 1 (multiplicative identity)
        // Using long data type to store larger factorial values
        long factorial = 1;

        // Traditional for loop to iterate from 1 to num (inclusive)
        for(int i = 1; i <= num; i++) {
            // Multiply the current factorial value with the loop counter i
            // For example: 6! = 1 * 1 * 2 * 3 * 4 * 5 * 6 = 720
            factorial = factorial * i;
        }

        // Print the final factorial result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
