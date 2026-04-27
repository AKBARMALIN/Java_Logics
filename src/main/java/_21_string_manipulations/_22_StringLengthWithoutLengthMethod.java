package _21_string_manipulations;

public class _22_StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        // Input string
        String str = "Testing";

        // Calling custom method to calculate length without using length()
        System.out.println("Length of the string: " + getLength(str));
    }

    // Method to calculate string length without using length()
    public static int getLength(String str) {

        // Counter to track index/length
        int i = 0;

        try {

            /*
             * Infinite loop to keep accessing characters
             * until an exception occurs
             */
            while(true) {

                // Access character at index i
                // If index is valid → continue
                // If index exceeds length → exception occurs
                str.charAt(i);

                // Increment counter
                i++;
            }
        } catch(StringIndexOutOfBoundsException e) {

            /*
             * Exception occurs when index goes beyond last character
             * At this point, 'i' will be equal to string length
             */
            return i;
        }
    }
}
