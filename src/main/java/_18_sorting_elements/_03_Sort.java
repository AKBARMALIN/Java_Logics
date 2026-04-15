package _18_sorting_elements;

import java.util.Arrays;

public class _03_Sort {

    public static void main(String[] args) {

        // Declare and initialize an integer array
        int[] a = {4, 2, 1, 5, 3, 6, 9, 8, 7};

        // Print array before sorting
        // Arrays.toString() converts array into readable string format
        System.out.println("Before Sorting: " + Arrays.toString(a));

        // Sort the array in ascending order
        // Arrays.sort() uses Dual-Pivot QuickSort internally for primitives
        Arrays.sort(a);

        // Print array after sorting
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
