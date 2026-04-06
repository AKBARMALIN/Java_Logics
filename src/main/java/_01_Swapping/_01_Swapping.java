package _01_Swapping;

/**
 * This class demonstrates swapping two numbers using a temporary variable.
 * This is the traditional and most straightforward approach to swap two values.
 */
public class _01_Swapping {

    public static void main(String[] args) {

        // Initialize two integers
        int a = 10;
        int b = 20;

        // Declare a temporary variable to hold one value during the swap
        int temp;

        // Print values before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the values using the temporary variable
        temp = b;
        b = a;
        a = temp;

        // Print values after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
