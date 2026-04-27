package _10_sum_of_elements;

public class _03_SumOfDigits {

    public static void main(String[] args) {

        // Input number
        int num = 12345;

        // Variable to store sum of digits
        int sum = 0;

        /*
         * Loop runs until number becomes 0
         * In each iteration:
         * 1. Extract last digit using modulus (%) operator
         * 2. Add it to sum
         * 3. Remove last digit using division (/)
         */
        while(num > 0) {
            // Get last digit (e.g., 12345 % 10 = 5)
            sum = sum + num % 10;

            // Remove last digit (e.g., 12345 / 10 = 1234)
            num = num / 10;
        }

        // Print the final sum of digits
        System.out.println("Sum of digits is: " + sum);
    }
}
