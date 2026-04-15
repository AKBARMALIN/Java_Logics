package _22_print_statements;

// Import BitSet class (used to store bits as 0s and 1s)
import java.util.BitSet;

public class _07_PrintOneToHundred {

    public static void main(String[] args) {

        // Create a BitSet and use double brace initialization
        // set(1, 101) sets bits from index 1 to 100 (101 is exclusive)
        // So bits 1 to 100 are set to true
        String str = new BitSet() {{
            set(1, 101);
        }}.toString();

        // BitSet.toString() returns values in format: {1, 2, 3, ..., 100}
        // We skip the first character '{' by starting from index 1
        // and print till the end → results in: 1, 2, 3, ..., 100
        System.out.append(str, 1, str.length());
    }
}
