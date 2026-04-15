package _15_find_duplicate_elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _04_FindDuplicates {

    public static void main(String[] args) {

        // Input array containing duplicate elements
        String[] infra = {"Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "SauceLabs", "Azure", "GCP"};

        // Create an empty HashSet to track unique elements
        Set<String> dataSet = new HashSet<>();

        /*
         * Stream the array → try adding elements to Set
         * If add() returns false → element already exists → it's a duplicate
         */
        Set<String> dupSet = Arrays.asList(infra).stream()
                // add() returns:
                // true  → element added first time (unique)
                // false → element already exists (duplicate)
                .filter(element -> !dataSet.add(element))
                // Collect duplicate elements into a Set
                .collect(Collectors.toSet());

        // Print duplicate elements
        System.out.println("Duplicate elements are: " + dupSet);
    }
}
