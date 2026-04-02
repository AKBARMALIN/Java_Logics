package _01_Swapping;

/**
 * This class demonstrates swapping two numbers using a single expression.
 */
public class _05_Swapping {

    public static void main(String[] args) {

        // Initialize two integers
        int a = 10;
        int b = 20;

        // Print values before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Perform the swap using a single expression
        b = a + b - (a = b); // This line performs the swap in a single expression

        // Print values after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
