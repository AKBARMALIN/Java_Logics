package _10_sum_of_elements;

// Class to calculate the sum of all elements in an array
public class _01_SumOfElements_Array {

    public static void main(String[] args) {
        // Initialize an array containing sample integers
        int[] arr = {5, 2, 7, 9, 6};

        // Initialize sum variable to store the total sum of all array elements
        int sum = 0;

        // Traditional for loop to iterate through each element using index
        for(int i = 0; i < arr.length; i++) {
            // Accumulate the sum by adding each array element to the current sum
            sum = sum + arr[i];
        }

        // Print the final sum of all array elements
        System.out.println("Sum of elements in the array is: " + sum);
    }
}
