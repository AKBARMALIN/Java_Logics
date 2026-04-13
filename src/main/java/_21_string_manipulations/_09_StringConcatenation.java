package _21_string_manipulations;

public class _09_StringConcatenation {

    public static void main(String[] args) {

        // Initialize two string variables
        String str1 = "Hello";
        String str2 = "World";

        // Initialize two integer variables
        int a = 100;
        int b = 200;

        // Concatenates two strings using concat() method
        // Output: HelloWorld
        System.out.println(str1.concat(str2));

        // Adds two integers (normal arithmetic addition)
        // Output: 300
        System.out.println(a + b);

        // Concatenation starts from left to right
        // First strings are combined -> "HelloWorld"
        // Then integers are treated as strings and appended -> "100200"
        // Output: HelloWorld100200
        System.out.println(str1 + str2 + a + b);

        // Since addition starts with integers, a + b = 300
        // Then strings are appended -> "HelloWorld"
        // Output: 300HelloWorld
        System.out.println(a + b + str1 + str2);

        // Parentheses force addition first (a + b = 300)
        // Then concatenation with strings
        // Output: HelloWorld300
        System.out.println(str1 + str2 + (a + b));
    }
}
