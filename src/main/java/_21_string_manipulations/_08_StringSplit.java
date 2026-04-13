package _21_string_manipulations;

public class _08_StringSplit {

    public static void main(String[] args) {

        // Initialize a string with words separated by underscore (_)
        String text = "Hello_World_Test_Selenium";

        // Split the string using "_" as delimiter
        // This will return an array of substrings
        String[] words = text.split("_");

        // Iterate through each word in the array using enhanced for loop
        for(String word : words) {

            // Print each split word on a new line
            System.out.println(word);
        }
    }
}
