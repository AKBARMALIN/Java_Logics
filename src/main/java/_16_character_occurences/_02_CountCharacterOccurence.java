package _16_Character_Occurences;

public class _02_CountCharacterOccurence {

    public static void main(String[] args) {

        // Input string
        String str = "I love coding and testing";

        // Calling method to count occurrences of different characters
        getCharacterOccurnce(str, 'o'); // count 'o'
        getCharacterOccurnce(str, 'i'); // count 'i'
        getCharacterOccurnce(str, 'z'); // count 'z' (not present case)
    }

    // Method to count occurrence of a given character
    public static void getCharacterOccurnce(String str, char val) {

        // Variable to store count of occurrences
        int count = 0;

        // Converting string into character array
        char[] chars = str.toCharArray();

        // Using enhanced for-loop (for-each) to iterate through characters
        for(char ch : chars) {

            // Check if current character matches the given character
            if(ch == val) {

                // Increment count if match is found
                count++;
            }
        }

        // Printing the result
        System.out.println("Character: " + val + ", Occurrence: " + count);
    }
}
