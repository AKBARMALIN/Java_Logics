package _12_equality_of_arrays;

// Class to check equality of two arrays
public class _02_EqualityOfTwoArrays {
    public static void main(String[] args) {

        // Initialize first array with sample integers
        int[] arr1 = {5, 2, 7, 9, 7};

        // Initialize second array with sample integers
        int[] arr2 = {5, 2, 7, 10, 7};

        // Flag to track if both arrays are equal
        boolean status = true;

        // Check if both arrays have the same length
        if(arr1.length == arr2.length) {

            // Loop through each element in both arrays
            for(int i = 0; i < arr1.length; i++) {

                // Compare corresponding elements from both arrays
                if(arr1[i] != arr2[i]) {

                    // If any elements don't match, set status to false
                    status = false;

                    // Exit the loop early as arrays are already not equal
                    break;
                }
            }
        } else {
            // If lengths are different, arrays cannot be equal
            status = false;
        }

        // Print result based on equality status
        if(status) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Both arrays are not equal.");
        }
    }
}
