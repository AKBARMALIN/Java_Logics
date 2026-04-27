package _34_string_joiners;

import java.util.StringJoiner;

public class _01_String_Joiners {

    public static void main(String[] args) {

        // Creating a StringJoiner object
        // Delimiter = "," (comma between elements)
        // Prefix = "[" (added at beginning)
        // Suffix = "]" (added at end)
        StringJoiner joiner = new StringJoiner(",", "[", "]");

        // Adding elements to the StringJoiner
        joiner.add("Tom");
        joiner.add("Lisa");
        joiner.add("akbar");

        // Printing the final joined string
        // Output will be: [Tom,Lisa,akbar]
        System.out.println(joiner.toString());
    }
}
