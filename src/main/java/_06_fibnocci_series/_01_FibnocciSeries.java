package _06_fibnocci_series;

/**
 * This class generates and prints the Fibonacci series up to the 10th number.
 */
public class _01_FibnocciSeries {

    public static void main(String[] args) {

        // Initialize the first two numbers of the Fibonacci series
        int n1 = 0;
        int n2 = 1;
        int sum;

        // Print the initial part of the series
        System.out.print("Fibonacci Series: " + n1 + " " + n2);

        // Loop to generate the next 8 numbers (since 2 are already printed, up to 10)
        for(int i = 2; i <=10; i++) {
            sum = n1 + n2; // Calculate the next number in the series
            System.out.print(" " + sum); // Print the next number
            n1 = n2; // Update n1 to the last number
            n2 = sum; // Update n2 to the new number
        }
    }
}
