package _18_SortingElements;

import java.util.Arrays;

public class _02_ParallelSort {

    public static void main(String[] args) {

        // Declare and initialize an integer array
        int[] a = {4, 2, 1, 5, 3};

        // Print array before sorting
        // Arrays.toString() converts array into readable format
        System.out.println("Before Sorting: " + Arrays.toString(a));

        // Sort the array using parallelSort()
        // This method divides the array into multiple parts
        // and sorts them in parallel using multiple threads
        // It is useful for large datasets for better performance
        Arrays.parallelSort(a);

        // Print array after sorting
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
