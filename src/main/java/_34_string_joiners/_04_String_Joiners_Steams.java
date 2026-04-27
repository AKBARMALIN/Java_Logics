package _34_string_joiners;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _04_String_Joiners_Steams {

    public static void main(String[] args) {

        /*
         * Arrays.asList(1, 2, 3, 4, 5)
         * → Creates a List of Integer elements
         */
        String join = Arrays.asList(1, 2, 3, 4, 5)
                /*
                 * Convert the List into a Stream
                 */
                .stream()

                /*
                 * map() is used to transform each element
                 * Here, converting Integer → String
                 * because Collectors.joining() works only with Strings
                 */
                .map(e -> String.valueOf(e))

                /*
                 * Collect and join all elements with ";" as delimiter
                 * Output: "1;2;3;4;5"
                 */
                .collect(Collectors.joining(";"));

        // Print the final joined string
        System.out.println(join); // Output: 1;2;3;4;5
    }
}
