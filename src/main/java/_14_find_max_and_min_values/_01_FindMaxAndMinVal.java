package _14_find_max_and_min_values;

public class _01_FindMaxAndMinVal {

    public static void main(String[] args) {

        // Input array with positive, zero, and negative values
        int[] a = {50, 0, 30, 40, 20, 80, 60, -1};

        // Initialize max and min with the first element
        int max = a[0];
        int min = a[0];

        /*
         * First loop → Find maximum value
         */
        for(int i = 0; i < a.length; i++) {
            // If current element is greater than max, update max
            if(a[i] > max) {
                max = a[i];
            }
        }

        /*
         * Second loop → Find minimum value
         */
        for(int i = 0; i < a.length; i++) {
            // If current element is smaller than min, update min
            if(a[i] < min) {
                min = a[i];
            }
        }

        // Print maximum value
        System.out.println("Max value is: " + max);

        // Print minimum value
        System.out.println("Min value is: " + min);
    }
}
