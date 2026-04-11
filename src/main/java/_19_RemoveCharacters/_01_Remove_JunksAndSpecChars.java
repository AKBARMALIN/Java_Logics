package _19_RemoveCharacters;

public class _01_Remove_JunksAndSpecChars {

    public static void main(String[] args) {

        // Input string containing alphabets, numbers, and special characters (junk values)
        String s = "H@e#l$l%o^&*()_+|}{\":?><,./;'[]\\=-`~ W@o#r$l%d^&*()_+|}{\":?><,./;'[]\\=-`~o";

        // Remove all junk and special characters using regular expression
        // [^a-zA-Z0-9] means:
        // ^        -> NOT (negation)
        // a-zA-Z   -> all lowercase and uppercase alphabets
        // 0-9      -> digits
        // So this regex matches anything that is NOT a letter or digit
        // replaceAll() replaces those characters with empty string ""
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        // Print the cleaned string (only alphabets and numbers remain)
        System.out.println(s);
    }
}
