package _04_count_digits;

public class _05_Count_Of_Words {

    public static void main(String[] args) {

        // Input string in CamelCase format
        String str = "AkbarAutomationLabsYoutube";

        int count = 0; // Variable to store count of uppercase letters

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++) {

            // Check if the current character is uppercase
            if(Character.isUpperCase(str.charAt(i))) {
                count++; // Increment count for each uppercase letter
            }
        }

        // Print total uppercase letters (i.e., number of words in CamelCase)
        System.out.println("The number of capitalized words in the string: " + count);
    }
}
