package _15_find_duplicate_elements;

import java.util.HashSet;
import java.util.Set;

public class _02_FindDuplicates {

    public static void main(String[] args) {

        // Input array containing some duplicate elements
        String[] arr = {"java", "C", "C++", "Python", "java", "javascript", "Python"};

        // Flag to check if any duplicate is found
        boolean status = false;

        // HashSet to store unique elements
        Set<String> langs = new HashSet<>();

        /*
         * Iterate through each element in the array
         */
        for(String element : arr) {

            // Try to add element to HashSet
            // add() returns:
            // true  → if element is added (not duplicate)
            // false → if element already exists (duplicate)
            if(langs.add(element) == false) {

                // If add() returns false → duplicate found
                System.out.println("Duplicate element is: " + element);

                // Update status flag
                status = true;
            }
        }

        // If no duplicates found, print message
        if(!status) {
            System.out.println("No duplicate element found in the array.");
        }
    }
}
