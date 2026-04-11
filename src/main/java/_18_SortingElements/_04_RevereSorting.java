package _18_SortingElements;

import java.util.Arrays;
import java.util.Collections;

public class _04_RevereSorting {

    public static void main(String[] args) {

        // Declare and initialize an Integer array
        // Note: We are using Integer (wrapper class), not int (primitive)
        // because reverseOrder() works only with objects, not primitives
        Integer[] a = {4, 2, 1, 5, 3};

        // Print array before sorting
        System.out.println("Before Sorting: " + Arrays.toString(a));

        // Sort the array in descending (reverse) order
        // Arrays.sort() sorts in ascending order by default
        // Collections.reverseOrder() is used as a comparator
        // to sort in descending order
        Arrays.sort(a, Collections.reverseOrder());

        // Print array after sorting
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
