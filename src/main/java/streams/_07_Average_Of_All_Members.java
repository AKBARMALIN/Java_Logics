package streams;

import java.util.Arrays;
import java.util.List;

public class _07_Average_Of_All_Members {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        /*
         * Convert the list into a stream
         * Then convert Stream<Integer> → IntStream using mapToInt()
         * (because average() works on numeric streams like IntStream)
         */
        double avg = list
                .stream()

                // Convert Integer objects to primitive int
                .mapToInt(e -> e)

                /*
                 * Calculate average
                 * Returns OptionalDouble (to handle empty list safely)
                 */
                .average()

                // Extract the double value from OptionalDouble
                .getAsDouble();

        // Print the average value
        System.out.println("Average: " + avg);
    }
}
