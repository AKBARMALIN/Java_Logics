package _13_finding_missing_numbers;

public class _02_FindMissingNumber {

    /*
     * Method to find the missing number in a sequence from 1 to totalAmount
     */
    public static int findMissingNumber(int[] arr, int totalAmount) {

        // Calculate expected sum of numbers from 1 to totalAmount
        // Formula: n * (n + 1) / 2
        int expAmount = totalAmount * ((totalAmount + 1)/2);

        // Variable to store actual sum of array elements
        int actAmount = 0;

        // Calculate actual sum of elements present in the array
        for(int i : arr) {
            actAmount = actAmount + i;
        }

        // Missing number = Expected sum - Actual sum
        return expAmount - actAmount;
    }

    public static void main(String[] args) {

        // Input array (one number is missing from 1 to 15 → here 11 is missing)
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15};

        // Total expected range of numbers
        int totalAmount = 15;

        // Call method to find missing number
        int missingNumber = findMissingNumber(arr, totalAmount);

        // Print the missing number
        System.out.println("Missing number is: " + missingNumber);
    }
}
