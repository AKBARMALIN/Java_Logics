package _15_FindDuplicateElements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _03_FindDuplicates {

    public static void main(String[] args) {

        // Input array containing duplicate elements
        String[] arr = {"java", "C", "C++", "Python", "java", "javascript", "C++"};

        // Create a HashMap to store element as key and its count as value
        Map<String, Integer> storeMap = new HashMap<>();

        /*
         * Iterate through each element in the array
         * and count the occurrences using HashMap
         */
        for(String element : arr) {
            // Get current count of the element from map
            Integer count = storeMap.get(element);

            if(count == null) {
                // If element is not present in map, add it with count = 1
                storeMap.put(element, 1);
            } else {
                // If element already exists, increment its count
                storeMap.put(element, ++count);
            }
        }

        /*
         * Convert map into entry set (key-value pairs)
         * to iterate and find duplicate elements
         */
        Set<Map.Entry<String, Integer>> entrySet = storeMap.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {

            // Check if count is greater than 1 (duplicate condition)
            if(entry.getValue() > 1) {

                // Print duplicate element (key)
                System.out.println("Duplicate element is: " + entry.getKey());
            }
        }
    }
}
