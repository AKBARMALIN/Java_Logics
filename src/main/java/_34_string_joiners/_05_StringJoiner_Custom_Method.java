package _34_string_joiners;

public class _05_StringJoiner_Custom_Method {

    /*
     * Custom method to join String values using a separator
     * Uses varargs (String... values) to accept multiple inputs
     */
    public static String joinString(String separator, String... values) {

        // Variable to track the end position (to remove last separator)
        int end = 0;

        // StringBuilder is used for efficient string concatenation
        StringBuilder sb = new StringBuilder();

        // Loop through each string value
        for(String s : values) {

            // Skip null values
            if(s != null) {

                // Append the string
                sb.append(s);

                // Store current length (before adding separator)
                end = sb.length();

                // Append separator
                sb.append(separator);
            }
        }

        /*
         * Remove the last extra separator using substring
         * end ensures we cut the string before the last separator
         */
        return sb.substring(0, end);
    }

    /*
     * Custom method to join Integer values using a separator
     * Uses varargs (Integer... values)
     */
    public static String joinInt(String seperator, Integer... values) {
        int end = 0;
        StringBuilder sb = new StringBuilder();

        // Loop through each integer
        for(Integer s : values) {

            // Skip null values
            if(s != null) {

                // Append integer (auto-converted to string)
                sb.append(s);

                // Store length before adding separator
                end = sb.length();

                // Append separator
                sb.append(seperator);
            }
        }

        // Remove last separator
        return sb.substring(0, end);
    }

    public static void main(String[] args) {

        // Call custom method for String values
        String join = joinString(";", "t", "r", "a", "i", "n", "i", "n", "g");
        System.out.println(join); // Output: t;r;a;i;n;i;n;g

        // Call custom method for Integer values
        String join2 = joinInt(";", 1, 2, 3, 4, 5);
        System.out.println(join2); // Output: 1;2;3;4;5
    }
}
