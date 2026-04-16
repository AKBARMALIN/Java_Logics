package _04_count_digits;

public class _04_Count_Of_Words {

    public static void main(String[] args) {

        // Input string in CamelCase format
        String str = "AkbarAutomationLabsYoutube";
        int count = 0;

        // Loop through each character of the string
        for(int i = 0; i < str.length(); i++) {

            // Check if character ASCII value is between 65 ('A') and 90 ('Z')
            // This condition identifies uppercase letters
            if(str.charAt(i) >= 64 && str.charAt(i) <= 90) {
                count++; // Increment count
            }
        }

        // Print total uppercase letters (i.e., number of words)
        System.out.println("The number of capitalized words in the string: " + count);

    }
}
