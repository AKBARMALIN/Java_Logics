package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _10_StartsWIth {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> list = Arrays.asList(2, 222, 234, 567, 890, 432, 234);

        /*
         * Stream processing steps:
         * 1. Convert Integer → String
         * 2. Filter numbers whose string starts with "2"
         * 3. Convert back String → Integer
         * 4. Collect into a List
         */
        List<Integer> startsWith2 = list
                .stream()

                // Step 1: Convert each Integer to String
                .map(e -> String.valueOf(e))

                // Step 2: Filter strings that start with "2"
                .filter(e -> e.startsWith("2"))

                // Step 3: Convert back String to Integer
                .map(Integer :: valueOf)

                // Step 4: Collect results into a List
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Numbers starting with 2: " + startsWith2);
    }
}
