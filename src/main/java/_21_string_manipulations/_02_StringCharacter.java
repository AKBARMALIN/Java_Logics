package _21_string_manipulations;

public class _02_StringCharacter {

    public static void main(String[] args) {

        // Original string
        String str = "The rains have started here.";

        // charAt(index) returns the character present at the specified index
        // Indexing starts from 0
        // Index positions: T(0) h(1) e(2) ' '(3) r(4) a(5)
        // So, character at index 5 is 'a'
        System.out.println("The character at index 5 is: " + str.charAt(5));
    }
}
