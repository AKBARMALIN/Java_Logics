package _22_print_statements;

import java.util.Arrays;

public class _06_PrintOneToHundred {

    public static void main(String[] args) {

        // Create an Object array of size 100
        Object[] num = new Object[100];

        // Fill the array with the SAME anonymous object
        Arrays.fill(num, new Object() {

            // Counter variable (shared across all elements)
            int count = 0;

            @Override
            public String toString() {
                // Each time toString() is called, increment count and return value
                return Integer.toString(++count);
            }
        });

        // Arrays.toString() internally calls toString() on each element
        // Since all elements refer to the SAME object,
        // toString() is called 100 times → prints numbers from 1 to 100
        System.out.println(Arrays.toString(num));
    }
}
