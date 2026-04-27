package _34_string_joiners;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _03_String_Joiners_Steams {

    public static void main(String[] args) {

        /*
         * Arrays.asList(...) converts given elements into a List
         * Example: ["t", "r", "a", "i", "n", "i", "n", "g"]
         */
        String join = Arrays.asList("t", "r", "a", "i", "n", "i", "n", "g")
                /*
                 * Convert the List into a Stream
                 * Stream allows functional-style operations on collections
                 */
                .stream()
                /*
                 * Collect elements using Collectors.joining(";")
                 * It joins all elements with ";" as delimiter
                 *
                 * Output: t;r;a;i;n;i;n;g
                 */
                .collect(Collectors.joining(";"));

        // Print the final joined string
        System.out.println(join); // Output: t;r;a;i;n;i;n;g
    }
}
