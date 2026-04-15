package _15_find_duplicate_elements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _05_FindDuplicates {

    public static void main(String[] args) {

        // Input array containing duplicate elements
        String[] infra = {"Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "SauceLabs", "Azure", "GCP"};

        // Convert array to List (needed for Collections.frequency)
        List<String> list = Arrays.asList(infra);

        /*
         * Create stream from array → filter elements whose frequency > 1
         * → collect results into a Set to avoid duplicate entries in output
         */
        Set<String> duplicates = Arrays.asList(infra).stream()

                // Filter elements that appear more than once
                .filter(e -> Collections.frequency(list, e) > 1)

                // Collect duplicate elements into a Set (unique values only)
                .collect(Collectors.toSet());

        // Print duplicate elements
        System.out.println("Duplicate elements are: " + duplicates);
    }
}
