package _21_string_manipulations;

public class _04_StringEquals {

    public static void main(String[] args) {

        // First string
        String str = "The rains have started here";

        // Second string with different cases (uppercase/lowercase differences)
        String str1 = "The rains Have started herE";

        // equals() method compares strings exactly (case-sensitive)
        // Since there are case differences, this will return false
        System.out.println("Comparing str and str1 using equals() method: " + str.equals(str1));

        // equalsIgnoreCase() compares strings ignoring case differences
        // Even though cases differ, the content is same → returns true
        System.out.println("Comparing str and str1 using equalsIgnoreCase() method: " + str.equalsIgnoreCase(str1));

    }
}
