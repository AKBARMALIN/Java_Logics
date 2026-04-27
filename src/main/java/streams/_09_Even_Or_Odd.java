package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _09_Even_Or_Odd {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> list = Arrays.asList(10, 15, 14, 16, 20,  1, 5, 8, 60);

        /*
         * Extract even numbers:
         * 1. Convert list to stream
         * 2. Filter elements divisible by 2
         * 3. Collect result into a List
         */
        List<Integer> evenList = list
                .stream()

                // Keep only even numbers (divisible by 2)
                .filter(e -> e % 2 == 0)

                // Convert stream back to List
                .collect(Collectors.toList());

        // Print even numbers
        System.out.println("Even numbers: " + evenList);

        /*
         * Extract odd numbers:
         * 1. Convert list to stream
         * 2. Filter elements not divisible by 2
         * 3. Collect result into a List
         */
        List<Integer> oddList = list
                .stream()

                // Keep only odd numbers (not divisible by 2)
                .filter(e -> e % 2 != 0)

                // Convert stream back to List
                .collect(Collectors.toList());

        // Print odd numbers
        System.out.println("Odd numbers: " + oddList);
    }
}
