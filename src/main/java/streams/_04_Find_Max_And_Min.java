package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class _04_Find_Max_And_Min {

    public static void main(String[] args) {

        // Creating a list of integers (contains duplicates as well)
        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19,  3, 40);

        // Finding maximum value using Stream API
        int max = list
                .stream()
                // Converts list into a stream
                .max(Comparator.naturalOrder())
                // Compares elements in natural order (ascending)
                // max() returns Optional<Integer>
                .get();
        System.out.println("Max: " + max);

        // Finding minimum value using Stream API
        int min = list
                .stream()
                .min(Comparator.naturalOrder())
                // Finds the smallest element based on natural ordering
                .get(); // Extract value from Optional

        System.out.println("Min: " + min);
    }
}
