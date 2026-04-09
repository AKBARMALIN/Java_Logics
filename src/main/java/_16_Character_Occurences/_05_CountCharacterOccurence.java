package _16_Character_Occurences;

// Importing StringUtils class from Apache Commons Lang library
// It provides utility methods for String operations
import org.apache.commons.lang3.StringUtils;

public class _05_CountCharacterOccurence {

    public static void main(String[] args) {

        // Input string
        String str = "I love coding and testing";

        // Using StringUtils.countMatches() to count occurrences of "o"
        // This method counts how many times a substring appears in the given string
        int count = StringUtils.countMatches(str, "o");

        // Printing the result
        System.out.println("Character: o, Occurrence: " + count);
    }
}
