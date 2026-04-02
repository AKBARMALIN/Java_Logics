package _01_Swapping;

/**
 * This class demonstrates swapping two numbers using the bitwise XOR operator.
 */
public class _04_Swapping {

    public static void main(String[] args) {

        // Initialize two integers
        int a = 10;
        int b = 20;

        // Print values before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using bitwise XOR operator
        a = a ^ b; // a now holds the result of a XOR b
        b = a ^ b; // b now holds the original value of a
        a = a ^ b; // a now holds the original value of b

        // Print values after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
