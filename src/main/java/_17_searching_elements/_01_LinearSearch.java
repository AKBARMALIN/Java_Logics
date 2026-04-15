package _17_searching_elements;

public class _01_LinearSearch {

    public static void main(String[] args) {

        // Declaring and initializing an array (no need to be sorted for linear search)
        int[] arr = {10, 20, 40, 50, 30};

        // Element to be searched
        int searchElement = 30;

        // Flag to check whether element is found or not
        boolean status = false;

        // Loop through each element of the array
        for(int i = 0; i < arr.length; i++) {

            // Check if current element matches the search element
            if(arr[i] == searchElement) {

                // If match found, update status
                status = true;

                // Print index where element is found
                System.out.println("Element found at index: " + i);

                // Exit loop since element is found
                break;
            }
        }

        // If element is not found after checking all elements
        if(!status) {
            System.out.println("Element not found in the array.");
        }
    }
}
