package _04_count_digits;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_Count_Of_Words {

    public static void main(String[] args) {

        // Input string in CamelCase format
        String str = "thisAkbarAutomationLabsYoutubeChannel";

        int count = 0; // Variable to store word count

        // Check if the first character is lowercase
        // If yes, it means the first word starts from lowercase
        if(Character.isLowerCase(str.charAt(0))) {
            count++;
        }

        // Regular expression to match uppercase letters
        // Each uppercase letter indicates a new word in CamelCase
        String reg = "[A-Z]+";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(reg);

        // Create matcher object to find matches in the string
        Matcher matcher = pattern.matcher(str);

        // Loop through all uppercase matches
        while(matcher.find()) {
            // matcher.group(0) gives matched uppercase letters
            // length() is added in case of multiple uppercase letters (like "USA")
            count += matcher.group(0).length();
        }

        // Print total number of words
        System.out.println(count);
    }
}
