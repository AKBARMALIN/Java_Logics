package _04_count_digits;

public class _06_Count_Of_Words {

    public static void main(String[] args) {

        // Input string in CamelCase format
        String str = "AkbarAutomationLabsYoutubeChannel";

        // Convert string to IntStream using chars()
        // Filter characters based on ASCII values:
        // 65 = 'A', 90 = 'Z'
        // So this condition checks for uppercase letters
        long count = str.chars()
                        .filter(e -> e >= 65 && e <= 90)
                        .count();

        // Print the number of uppercase letters (i.e., number of words)
        System.out.println("The number of capitalized words in the string: " + count);
    }
}
