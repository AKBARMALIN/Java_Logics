package _13_FindingMissingNumbers;

public class _01_FindMissingNumber {

    public static void main(String[] args) {

        // Input array with one missing number (4 is missing here)
        int[] arr = {1, 2, 3, 5, 6};

        // Variable to store sum of array elements (actual sum)
        int sum1 = 0;

        // Variable to store sum of numbers from 1 to n (expected sum)
        int sum2 = 0;

        /*
         * Calculate actual sum of elements present in the array
         */
        for(int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }

        /*
         * Calculate expected sum from 1 to n (here n = 6)
         */
        for(int i = 1; i <= 6; i++) {
            sum2 = sum2 + i;
        }

        // Missing number = Expected sum - Actual sum
        System.out.println("Missing number is: " + (sum2 - sum1));
    }
}
