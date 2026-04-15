package _28_array_joining;

// Import Guava utility class for primitive int operations
import com.google.common.primitives.Ints;

public class _03_Arrays_Joining {

    public static void main(String[] args) {

        // First integer array
        int[] arr1 = {1, 2, 3, 4, 5};

        // Second integer array
        int[] arr2 = {6, 7, 8, 9, 10};

        // Concatenate both arrays using Guava's Ints utility
        // This merges arr1 and arr2 into a single int array
        int[] join = Ints.concat(arr1, arr2);

        // Iterate through the combined array and print each element
        for(int i : join) {
            System.out.println(i);
        }
    }
}
