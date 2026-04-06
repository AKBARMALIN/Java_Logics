package _15_FindDuplicateElements;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _06_FindDuplicates {

    public static void main(String[] args) {

        // Input array containing duplicate elements
        String[] infra = {"java", "C", "C++", "Python", "java", "javascript", "C++"};

        /*
         * Convert array to List → create Stream → group elements → count occurrences
         * Then filter elements with count > 1 (duplicates)
         * Finally collect duplicate keys into a Set
         */
        Set<String> dupSet = Arrays.asList(infra) // Convert array to List
                .stream() // Create Stream
                .collect(Collectors.groupingBy(
                        Function.identity(),  // Use the element itself as the key
                        Collectors.counting() // Group elements and count occurrences
                ))
                .entrySet().stream() // Create Stream of Map entries
                .filter(e -> e.getValue() > 1) // Filter entries where count > 1 (duplicates)
                .map(Map.Entry::getKey) // Extract keys (duplicate elements)
                .collect(Collectors.toSet()); // Collect duplicate keys into a Set

        // Print duplicate elements
        System.out.println("Duplicate elements are: " + dupSet);


        /*
		Explanation:
		.collect(Collectors.groupingBy(
		        Function.identity(),
		        Collectors.counting()
		))
		* It It groups elements and counts how many times each appears.
		*
		* Function.identity() - Use the element itself as the key like s -> s
		* After above steps Resutls will be:
		* {
  			AWS=2,
  			Azure=2,
  			GCP=1
		  }
		 *
		 *Now again use stream and filter the element if count > 1 from Map
		 *Collect to the Set
		*/
    }
}
