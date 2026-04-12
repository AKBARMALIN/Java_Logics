package _21_string_manipulations;

public class _07_StringReplace {

    public static void main(String[] args) {

        // Original string containing a sentence
        String str = "The rains have started here.";

        // Replacing the word "rains" with "sun"
        // replace() method returns a new string (Strings are immutable in Java)
        String newStr = str.replace("rains", "sun");

        // Printing original string (unchanged)
        System.out.println("Original string: " + str);

        // Printing modified string after replacement
        System.out.println("Modified string: " + newStr);

        // String containing a date in YYYY-MM-DD format
        String dateStr = "Today's date is 2026-04-12.";

        // Replacing '-' with '/' to change date format
        String newDateStr = dateStr.replace("-", "/");

        // Printing original date string
        System.out.println("Original date string: " + dateStr);

        // Printing modified date string
        System.out.println("Modified date string: " + newDateStr);
    }
}
