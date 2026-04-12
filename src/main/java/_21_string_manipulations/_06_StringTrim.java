package _21_string_manipulations;

public class _06_StringTrim {

    public static void main(String[] args) {

        // String with leading and trailing spaces
        String str = "  The rains have started here.   ";

        // Printing the original string with spaces (quotes help visualize spaces)
        System.out.println("Original string: '" + str + "'");

        // trim() method removes only leading and trailing spaces (not middle spaces)
        // It returns a new string (Strings are immutable in Java)
        System.out.println("Trimmed string: '" + str.trim() + "'");
    }
}
