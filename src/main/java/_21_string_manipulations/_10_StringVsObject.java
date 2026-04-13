package _21_string_manipulations;

public class _10_StringVsObject {

    // Method overloaded with Object parameter
    public static void test(Object obj) {
        System.out.println("Object version called");
    }

    // Method overloaded with String parameter
    public static void test(String str) {
        System.out.println("String version called");
    }

    public static void main(String[] args) {

        // Passing null as argument
        // null can match both Object and String

        // Java chooses the most specific method
        // String is more specific than Object

        // Hence, test(String str) method is called
        test(null);
    }
}
