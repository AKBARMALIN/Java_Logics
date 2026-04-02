package _01_Swapping;

/**
 * This class demonstrates swapping two numbers using addition and subtraction operations.
 */
public class _02_Swapping {
    public static void main(String[] args) {

        // Initialize two integers
        int a = 10;
        int b = 20;

        // Print values before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using addition and subtraction
        a = a + b; // a now holds the sum of a and b
        b = a - b; // b now holds the original value of a
        a = a - b; // a now holds the original value of b

        // Print values after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
