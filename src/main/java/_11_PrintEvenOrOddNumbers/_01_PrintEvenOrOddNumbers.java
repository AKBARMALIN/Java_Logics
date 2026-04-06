package _11_PrintEvenOrOddNumbers;

// Class to identify and print whether numbers in an array are even or odd
public class _01_PrintEvenOrOddNumbers {

    public static void main(String[] args) {

        // Initialize an array containing integers from 1 to 6
        int arr[] = {1, 2, 3, 4, 5, 6};

        // Traditional for loop to iterate through each element in the array using index
        for(int i = 0; i < arr.length; i++) {

            // Check if the current element is even by using modulo operator (%)
            // If remainder of division by 2 is 0, the number is even
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is an even number.");
            } else {
                // If remainder is not 0, the number is odd
                System.out.println(arr[i] + " is an odd number.");
            }
        }
    }
}
