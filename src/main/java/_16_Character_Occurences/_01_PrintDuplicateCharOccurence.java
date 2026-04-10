package _16_Character_Occurences;

// Importing required classes
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_PrintDuplicateCharOccurence {

    public static void main(String[] args) {

        // Test cases
        printDuplicateCharacterOccurence("hello world"); // normal string
        printDuplicateCharacterOccurence(""); // empty string
        printDuplicateCharacterOccurence(null); // null string
        printDuplicateCharacterOccurence("a"); // single character
    }

    // Method to print duplicate characters and their occurrences
    public static void printDuplicateCharacterOccurence(String str) {

        // Check if string is null
        if (str == null) {
            System.out.println("Null String provided");
            return;
        }

        // Check if string is empty
        if(str.isEmpty()) {
            System.out.println("Empty String provided");
            return;
        }

        // Check if string has only one character
        if(str.length() == 1) {
            System.out.println("Only one character provided, no duplicates possible");
            return;
        }

        // Convert string into character array
        char[] words = str.toCharArray();

        // Creating HashMap to store character and its count
        // Key → Character, Value → Frequency
        Map<Character, Integer> charMap = new HashMap<>();

        // Loop through each character
        for(Character ch : words) {

            // If character already exists in map, increment count
            if(charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            }
            // If character appears first time, add to map with count 1
            else {
                charMap.put(ch, 1);
            }
        }

        // Getting all entries (key-value pairs) from map
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

        // Loop through each entry
        for(Map.Entry<Character, Integer> entry : entrySet) {

            // Print only duplicate characters (count > 1)
            if(entry.getValue() > 1) {
                System.out.println("Character: " + entry.getKey() + ", Occurrence: " + entry.getValue());
            }
        }
    }
}
