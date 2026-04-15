package _10_sum_of_elements;

// Class to calculate the sum of all elements in an array
public class _02_SumOfElements_Array {

    public static void main(String[] args) {

        // Initialize an array containing sample integers
        int[] arr = {5, 2, 7, 9, 7};

        // Initialize total variable to store the sum of all elements
        int total = 0;

        // Enhanced for loop to iterate through each element in the array
        for(int i : arr) {
            // Accumulate the sum by adding each array element to the total
            total = total + i;
        }

        // Print the final sum of all array elements
        System.out.println("Sum of elements in the array is: " + total);
    }
}
