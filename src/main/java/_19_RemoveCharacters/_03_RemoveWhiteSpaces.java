package _19_RemoveCharacters;

public class _03_RemoveWhiteSpaces {

    public static void main(String[] args) {

        // Original input string containing spaces
        String s = "Java is a high level programming language";

        // Remove all whitespace characters from the string
        // \\s is a regular expression that matches any whitespace:
        // spaces, tabs, newlines, etc.
        s = s.replaceAll("\\s", "");

        // Print the string after removing all whitespaces
        System.out.println(s);
    }
}
