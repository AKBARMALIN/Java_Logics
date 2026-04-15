package _16_character_occurences;

public class _04_CountCharacterOccurence {

    public static void main(String[] args) {

        // Input string
        String str = "I love coding and testing";

        // Calling method to count occurrences of different characters
        getCharacterOccurence(str, "o"); // count 'o'
        getCharacterOccurence(str, "i"); // count 'i'
        getCharacterOccurence(str, "z"); // count 'z' (not present case)
    }

    // Method to count occurrence of a given character (passed as String)
    public static void getCharacterOccurence(String str, String val) {

        // str.chars() → converts string into IntStream (ASCII values of characters)
        // mapToObj() → converts each int to String (character to String)
        // (char)e → converts int to character
        // String.valueOf() → converts character to String
        // filter() → keeps only matching characters
        // equals(val) → compares with given input value
        // count() → counts matching elements
        long count = str.chars()
                .mapToObj(e -> String.valueOf((char)e))
                .filter(e -> e.equals(val))
                .count();

        // Printing the result
        System.out.println("Character: " + val + ", Occurrence: " + count);
    }
}
