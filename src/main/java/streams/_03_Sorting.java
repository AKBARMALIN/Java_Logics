package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _03_Sorting {

    public static void main(String[] args) {

        // Creating a list of integers (includes duplicate values)
        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19,  3, 40);

        // 🔹 Sorting in Ascending Order
        List<Integer> asc = list
                // Convert list to stream
                .stream()
                // Default sorting is natural order (ascending)
                .sorted()
                // Collect result back to List
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + asc);

        // 🔹 Sorting in Descending Order
        List<Integer> desc = list
                // Convert list to stream
                .stream()
                // reverseOrder() sorts elements in descending order
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending order: " + desc);
    }
}
