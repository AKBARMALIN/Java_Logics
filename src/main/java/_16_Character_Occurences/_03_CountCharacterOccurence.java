package _16_Character_Occurences;

public class _03_CountCharacterOccurence {

    public static void main(String[] args) {

        // Calling method to count occurrences of different characters
        getCharacterOccurnce("I love coding and testing", 'o'); // count 'o'
        getCharacterOccurnce("I love coding and testing", 'i'); // count 'i'
        getCharacterOccurnce("I love coding and testing", 'z'); // count 'z' (not present case)
    }

    // Method to count occurrence of a given character
    public static void getCharacterOccurnce(String str, char val) {

        // Variable to store count of occurrences
        int count = 0;

        // Converting string to character array (not used below, but shown as alternative)
        char[] chars = str.toCharArray();

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++) {

            // Check if current character matches the given character
            if(str.charAt(i) == val) {

                // Increment count if match is found
                count++;
            }
        }


        // Printing the result
        System.out.println("Character: " + val + ", occurrence: " + count);
    }
}
