package _11_print_even_or_odd_numbers;

// Class to identify and print whether numbers in an array are even or odd
public class _02_PrintEvenOrOddNumbers {

    public static void main(String[] args) {

        // Initialize an array containing integers from 1 to 10
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Enhanced for loop to iterate through each element in the array
        for(int i : arr) {
            // Check if the number is even by using modulo operator (%)
            // If remainder of division by 2 is 0, the number is even
            if(i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                // If remainder is not 0, the number is odd
                System.out.println(i + " is an odd number.");
            }
        }
    }
}
