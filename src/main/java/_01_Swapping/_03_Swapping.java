package _01_Swapping;

/**
 * This class demonstrates swapping two numbers using multiplication and division operations.
 */
public class _03_Swapping {

    public static void main(String[] args) {

        // Initialize two integers
        int a = 20;
        int b = 30;

        // Print values before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using multiplication and division
        a = a * b; // a now holds the product of a and b
        b = a / b; // b now holds the original value of a
        a = a / b; // a now holds the original value of b

        // Print values after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}
