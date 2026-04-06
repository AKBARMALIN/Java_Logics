package _14_FindMaxAndMinValues;

import java.util.Arrays;

public class _02_FindMaxAndMinVal {

    public static void main(String[] args) {

        // Input array containing positive, zero, and negative values
        int[] a = {50, 0, 30, 40, 20, 80, 60, -1};

        // Initialize largest and smallest with the first element of the array
        int largest = a[0];
        int smallest = a[0];

        /*
         * Traverse the array to find largest and smallest values
         */
        for(int i = 0; i < a.length; i++) {

            // Check if current element is greater than largest
            if(a[i] > largest) {
                largest = a[i];  // Update largest value
            }
            // Check if current element is smaller than smallest
            else if(a[i] < smallest) {
                smallest = a[i]; // Update smallest value
            }
        }

        // Print the input array
        System.out.println("\n The given array is: " + Arrays.toString(a));

        // Print largest value
        System.out.println("\n Largest value is: " + largest);

        // Print smallest value
        System.out.println("\n Smallest value is: " + smallest);
    }
}
