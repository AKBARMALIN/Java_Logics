package _16_Character_Occurences;

import java.util.Scanner;

public class _08_CountWordsInAString {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.println("Enter a string: ");

        // Read full line (including spaces)
        String str = sc.nextLine();

        // Initialize word count to 1
        // (Assuming the string contains at least one word)
        int count = 1;

        // Loop through the string till second last character
        for(int i = 0; i < str.length() - 1; i++) {

            // Check condition:
            // Current character is space AND next character is not space
            // This indicates the start of a new word
            if(str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        // Print total word count
        System.out.println("Total number of words in the string: " + count);
    }
}
