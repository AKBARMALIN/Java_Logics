package _09_factorial_number;

// Import BigInteger class to handle large integer values that exceed regular int limit
import java.math.BigInteger;

// Class to calculate factorial of large numbers using BigInteger
public class _04_FactorialNumber {

    public static void main(String[] args) {
        // Initialize the number for which we want to calculate factorial
        int num = 100;

        // Initialize factorial with BigInteger.ONE (value of 1)
        // BigInteger is used because factorial of 100 is extremely large and cannot fit in regular int or long
        BigInteger factorial = BigInteger.ONE;

        // Traditional for loop to iterate from 1 to num (inclusive)
        for(int i = 1; i <=num; i++) {
            // Multiply the current factorial value with the loop counter i
            // BigInteger.valueOf(i) converts the int i to BigInteger for multiplication
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        // Print the final factorial result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
