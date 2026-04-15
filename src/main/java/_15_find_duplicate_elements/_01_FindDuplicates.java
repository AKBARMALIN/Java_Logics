package _15_find_duplicate_elements;

public class _01_FindDuplicates {

    public static void main(String[] args) {

        // Input array containing duplicate elements
        String[] arr = {"java", "C", "C++", "Python", "java", "javascript", "C++"};

        // Flag to check if any duplicate is found
        boolean status = false;

        /*
         * Outer loop → picks each element one by one
         */
        for(int i = 0; i < arr.length; i++) {

            /*
             * Inner loop → compares current element (arr[i])
             * with remaining elements (arr[j])
             */
            for(int j = i + 1; j < arr.length; j++) {

                // Compare elements
                // NOTE: For Strings, equals() should be used instead of '=='
                if(arr[i] == arr[j]) {

                    // If match found → duplicate element
                    System.out.println("Duplicate element is: " + arr[i]);

                    // Update status flag
                    status = true;
                }
            }
        }

        // If no duplicates found, print message
        if(!status) {
            System.out.println("No duplicate element found in the array.");
        }
    }
}
