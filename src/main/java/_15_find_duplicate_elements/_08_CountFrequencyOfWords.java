package _15_find_duplicate_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _08_CountFrequencyOfWords {

    public static void main(String[] args) {

        // Input string containing words
        String text = "apple banana apple orange banana apple";

        // Splitting the string into words based on space delimiter
        String[] words = text.split(" ");

        // Creating a HashMap to store word and its frequency
        // Key → word, Value → count
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Iterating through each word in the array
        for(String word : words) {

            // If the word already exists in the map, increment its count
            if(wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            }
            // If the word is not present, add it with count 1
            else {
                wordFrequency.put(word, 1);
            }
        }

        // Getting all key-value pairs (word-frequency) from the map
        Set<Map.Entry<String, Integer>> entrySet = wordFrequency.entrySet();

        // Iterating through each entry in the map
        for(Map.Entry<String, Integer> entry : entrySet) {

            // Printing word and its corresponding frequency
            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
