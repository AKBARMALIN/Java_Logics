package _12_EqualityOfArrays;

// Import the Arrays utility class for comparing arrays
import java.util.Arrays;

// Class to check equality of two arrays using Arrays.equals() method
public class _01_EqualityOfArrays {
    public static void main(String[] args) {

        // Initialize first array with sample integers
        int arr1[] = {1, 2, 3, 4, 5};

        // Initialize second array with sample integers
        int arr2[] = {1, 2, 3, 4, 6};

        // Use Arrays.equals() to compare both arrays and store the result
        // This method returns true if both arrays have the same length and corresponding elements are equal
        boolean status = Arrays.equals(arr1, arr2);

        // Check the result and display appropriate message
        if(status) {
            // Print message if arrays are equal
            System.out.println("Both arrays are equal.");
        } else {
            // Print message if arrays are not equal
            System.out.println("Both arrays are not equal.");
        }
    }
}
