package _17_SearchingElements;

public class _02_BinarySearch {

    public static void main(String[] args) {

        // Declaring and initializing a sorted array
        // NOTE: Binary Search works only on sorted arrays
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // 'l' represents the starting index (low)
        int l = 0;

        // 'h' represents the ending index (high)
        int h = arr.length - 1;

        // Element to search
        int key = 90;

        // Flag to check whether element is found or not
        boolean status = false;

        // Loop runs until the search space is valid
        while(l <= h) {

            // Finding the middle index
            int mid = (l + h) / 2;

            // Check if middle element is the key
            if(arr[mid] == key) {

                // Element found → print index
                System.out.println("Element found at index: " + mid);

                // Update status to true
                status = true;

                // Exit loop since element is found
                break;
            }

            // If key is greater than middle element
            // Ignore left half and search in right half
            if(arr[mid] < key) {
                l = mid + 1;
            }
            // If key is smaller than middle element
            // Ignore right half and search in left half
            else {
                h = mid - 1;
            }
        }

        // If element is not found after loop
        if(!status) {
            System.out.println("Element not found in the array.");
        }
    }
}
