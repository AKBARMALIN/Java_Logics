package _04_count_digits;

public class _03_Count_Of_Words {

    public static void main(String[] args) {

        // Input string in CamelCase format
        String str = "AkbarAutomationLabsYoutube";

        // Variable to store count of uppercase letters
        int count = 0;

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++) {

            // Check if the character is between 'A' and 'Z'
            // This identifies uppercase letters
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }

        // Print the number of uppercase letters (i.e., number of words in CamelCase)
        System.out.println("The number of capitalized words in the string: " + count);
    }
}
