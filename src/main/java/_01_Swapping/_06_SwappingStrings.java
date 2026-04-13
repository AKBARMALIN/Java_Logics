package _01_Swapping;

public class _06_SwappingStrings {

    public static void main(String[] args) {

        // Initialize two string variables
        String a = "Hello";
        String b = "World";

        // Print values before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Step 1: Concatenate both strings and store in 'a'
        // Now 'a' becomes "HelloWorld"
        a = a + b; // a now holds "HelloWorld"

        // Step 2: Extract original value of 'a' and assign it to 'b'
        // substring(0, a.length() - b.length()) gives "Hello"
        b = a.substring(0, a.length() - b.length());

        // Step 3: Extract original value of 'b' and assign it to 'a'
        // substring(b.length()) gives "World"
        a = a.substring(b.length());

        // Print values after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
