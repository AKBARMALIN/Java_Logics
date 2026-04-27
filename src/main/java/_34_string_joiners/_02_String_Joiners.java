package _34_string_joiners;

public class _02_String_Joiners {

    public static void main(String[] args) {

        // Array of single-character strings
        String[] arr = {"t", "r", "a", "n", "g", "e"};

        /*
         * String.join() is used to concatenate elements of an array
         * using a specified delimiter.
         *
         * Syntax: String.join(delimiter, elements)
         *
         * Here, "-" is used as a delimiter, so it joins all elements
         * with '-' in between.
         */
        String join = String.join("-", arr);

        // Print the joined string
        System.out.println(join); // Output: t-r-a-n-g-e
    }
}
