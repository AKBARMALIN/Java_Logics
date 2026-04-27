package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _05_Duplicates_01 {

    public static void main(String[] args) {

        // Creating a list with duplicate values
        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 19, 3);

        // Using Stream API to find duplicate elements
        Set<Integer> duplicates = list
                .stream()

                // Filter elements whose frequency is greater than 1
                // Collections.frequency(list, e) counts how many times 'e' appears in the list
                .filter(e -> Collections.frequency(list, e) > 1)

                // Collect result into a Set to avoid repeating duplicate values
                .collect(Collectors.toSet());

        // Print duplicate numbers
        System.out.println("Duplicate numbers: " + duplicates);
    }
}
