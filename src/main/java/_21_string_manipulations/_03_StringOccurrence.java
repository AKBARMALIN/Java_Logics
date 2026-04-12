package _21_string_manipulations;

public class _03_StringOccurrence {

    public static void main(String[] args) {

        // Original string
        String str = "The rains have started here";

        // indexOf("s") returns the index of the FIRST occurrence of 's'
        System.out.println("The index of the first occurrence of 's' is: " + str.indexOf("s"));

        // Finding SECOND occurrence of 's'
        // Start searching from index just after the first occurrence
        System.out.println("The index of the second occurrence of 's' is: " + str.indexOf("s", str.indexOf("s") + 1));

        // Finding THIRD occurrence of 's'
        // First find second occurrence, then search after that index
        System.out.println("The index of the third occurrence of 's' is: " + str.indexOf("s", str.indexOf("s", str.indexOf("s") + 1) + 1));

        // indexOf("have") returns the starting index of substring "have"
        System.out.println("The index of the specific occurrence of 'have' is: " + str.indexOf("have"));

        // If substring is not found, indexOf() returns -1
        System.out.println("The index of the 'hello' which is not exist " + str.indexOf("hello"));
    }
}
