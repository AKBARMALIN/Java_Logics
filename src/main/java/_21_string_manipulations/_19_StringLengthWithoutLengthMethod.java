package _21_string_manipulations;

public class _19_StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        // Input string
        String str = "Testing";

        /*
         * split("") splits the string into an array of single characters
         * Example: "Testing" -> ["T", "e", "s", "t", "i", "n", "g"]
         *
         * length of this array = number of characters in the string
         */
        System.out.println("Length of the string: " + str.split("").length);
    }
}
