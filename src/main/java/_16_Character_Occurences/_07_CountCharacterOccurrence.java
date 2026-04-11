package _16_Character_Occurences;

public class _07_CountCharacterOccurrence {

    public static void main(String[] args) {

        // Input string
        String s = "Java is a programming language";

        // Get total length of the string (including spaces and all characters)
        int total = s.length();

        // Remove all occurrences of character 'a' using replaceAll()
        // Then calculate the length of the new string
        int totalWithoutA = s.replaceAll("a", "").length();

        // The difference between original length and new length
        // gives the count of 'a' characters in the string
        int count = total - totalWithoutA;

        // Print the count of 'a'
        System.out.println("Total number of 'a' in the string: " + count);
    }
}
