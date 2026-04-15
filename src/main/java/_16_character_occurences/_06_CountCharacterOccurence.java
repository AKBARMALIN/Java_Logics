package _16_character_occurences;

public class _06_CountCharacterOccurence {

    public static void main(String[] args) {

        // Input string
        String str = "testing solutions by akbar automation labs";

        // Counting occurrence of single character 's'
        System.out.println("Character: s, Occurrence: " + getCharCount(str, 's'));

        // Counting occurrence of two characters 's' and 'a'
        System.out.println("Character: s and a, Occurrence: " + getCharCount(str, 's', 'a'));
    }

    // Method to count occurrence of a single character
    public static long getCharCount(String str, char c) {

        // str.chars() → converts string into IntStream of ASCII values
        // filter() → keeps only matching characters
        // (char)e == c → converts int to char and compares with given character
        // count() → returns total number of matching elements
        return str.chars()
                .filter(e -> (char)e == c)
                .count();
    }

    // Overloaded method to count occurrence of two characters
    public static long getCharCount(String str, char c1, char c2) {

        // Filters characters matching either c1 OR c2
        return str.chars()
                .filter(e -> (char)e == c1 || (char)e == c2)
                .count();
    }
}
