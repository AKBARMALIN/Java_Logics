package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _06_Duplicates_02 {

    public static void main(String[] args) {

        // Creating a list with some duplicate values
        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 19, 3);

        // HashSet is used to store unique elements
        // Set.add() returns:
        // true  -> if element is added (not present before)
        // false -> if element already exists (duplicate)
        Set<Integer> set = new HashSet<>();

        // Stream the list and filter duplicate elements
        Set<Integer> duplicateValues = list.stream()
                // If set.add(e) returns false → element is duplicate
                // So we use !set.add(e) to capture duplicates
                .filter(e -> !set.add(e))
                // Collect duplicate elements into a Set (to avoid repeating duplicates)
                .collect(Collectors.toSet());

        // Print duplicate values
        System.out.println("Duplicate numbers: " + duplicateValues);
    }
}
