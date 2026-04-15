package _18_sorting_elements;

// Importing Arrays class to use utility methods like toString()
import java.util.Arrays;

public class _01_BubbleSort {

    public static void main(String[] args) {

        // Declaring and initializing an integer array
        int[] arr = {4, 2, 1, 5, 3};

        // Printing array before sorting
        System.out.println("Before Sorting: "+ Arrays.toString(arr));

        // Outer loop -> controls number of passes
        // We need (n-1) passes for n elements
        for(int i = 0; i < arr.length - 1; i++) {

            // Inner loop -> compares adjacent elements
            // It pushes the largest element to the end in each pass
            for(int j = 0; j < arr.length - 1 ; j++) {

                // Compare current element with next element
                if(arr[j] > arr[j +1]) {

                    // Swap elements if they are in wrong order
                    int temp = arr[j];  // Store current element
                    arr[j] = arr[j + 1]; // Move next element to current position
                    arr[j + 1] = temp; // Move stored element to next position
                }
            }
        }

        // Printing array after sorting
        System.out.println("After Sorting: "+ Arrays.toString(arr));
    }
}
