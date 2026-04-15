package _19_remove_characters;

public class _02_RemoveWhiteSpaces {

    public static void main(String[] args) {

        // Original input string containing spaces
        String s = "Java is a programming language";

        // Remove only space characters from the string
        // " " (single space) is used instead of regex like \\s
        // This removes only normal spaces, not tabs or new lines
        s = s.replaceAll(" ", "");

        // Print the string after removing spaces
        System.out.println(s);
    }
}
