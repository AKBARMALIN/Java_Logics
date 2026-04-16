package _04_count_digits;

public class _07_Count_Of_Words {

    public static void main(String[] args) {

        // Input string in CamelCase format
        String str = "AkbarAutomationLabsYoutube";

        // Convert string to IntStream using chars()
        // Filter only uppercase letters using Character.isUpperCase()
        // Count how many uppercase letters exist
        long count =  str.chars()
                        .filter(e -> Character.isUpperCase(e))
                        .count();

        // Print the number of uppercase letters (i.e., number of words in CamelCase)
        System.out.println("The number of capitalized words in the string: " + count);
    }
}
