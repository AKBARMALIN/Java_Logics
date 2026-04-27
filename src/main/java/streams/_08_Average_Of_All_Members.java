package streams;

import java.util.Arrays;
import java.util.List;

public class _08_Average_Of_All_Members {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> list = Arrays.asList(10, 15, 14, 16, 20);

        /*
         * Stream processing steps:
         * 1. Convert list to stream
         * 2. Square each element
         * 3. Filter values greater than 100
         * 4. Convert to IntStream
         * 5. Calculate average
         */
        double avg = list
                .stream()

                // Step 1 & 2: Square each number (e * e)
                .map(e -> e * e)

                // Step 3: Keep only values greater than 100
                .filter(e -> e > 100)

                // Step 4: Convert Integer to primitive int
                .mapToInt(e -> e)

                /*
                 * Step 5: Calculate average
                 * Returns OptionalDouble (to handle empty results)
                 */
                .average()

                // Extract the double value
                .getAsDouble();

        // Print the final average
        System.out.println("Average: " + avg);
    }
}
