package _17_searching_elements;

// Importing Arrays class to use built-in binarySearch method
import java.util.Arrays;

public class _03_BinarySearch {

    public static void main(String[] args) {

        // Declaring and initializing a sorted array
        // NOTE: Binary search works ONLY on sorted arrays
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Using Arrays.binarySearch() method to search for element 90
        // If element is found → returns index of element
        // If not found → returns (-(insertion point) - 1)
        int binarySearch = Arrays.binarySearch(arr, 90);

        // Printing the index of the found element
        System.out.println("Element found at index: " + binarySearch);
    }
}
