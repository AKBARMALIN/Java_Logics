package _21_string_manipulations;

public class _05_StringSubstring {

    public static void main(String[] args) {

        // Original string
        String str = "The rains have started here.";

        // substring(startIndex, endIndex) extracts a portion of the string
        // startIndex is inclusive, endIndex is exclusive
        // It will return characters from index 4 to 8
        // Index positions: T(0) h(1) e(2) ' '(3) r(4) a(5) i(6) n(7) s(8)
        // So output will be "rains"
        System.out.println("The substring from index 4 to 9 is: " + str.substring(4, 9));
    }
}
