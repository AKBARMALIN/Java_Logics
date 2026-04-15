package _15_FindDuplicateElements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _07_NumberOfDuplicateWords {

    public static void main(String[] args) {

        // Calling method with input string
        findDuplicateWords("Hye java is java is language java");
    }

    // Method to find and print duplicate words with their count
    public static void findDuplicateWords(String str) {

        // Splitting the input string into words using space as delimiter
        String[] words = str.split(" ");

        // Creating a HashMap to store word and its frequency
        // Key → word, Value → count
        Map<String, Integer> wordCount = new HashMap<>();

        // Iterating through each word
        for(String word: words) {

            // If word already exists in map, increment its count
            if(wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            // If word is not present, add it with count 1
            else {
                wordCount.put(word, 1);
            }
        }

        // Getting all keys (words) from the map
        Set<String> keySet = wordCount.keySet();

        // Iterating through each word to find duplicates
        for(String key : keySet) {

            // Checking if the word count is greater than 1 (duplicate)
            if(wordCount.get(key) > 1) {

                // Printing duplicate word and its count
                System.out.println("Duplicate word: " + key + ", Count: " + wordCount.get(key));
            }
        }
    }
}
