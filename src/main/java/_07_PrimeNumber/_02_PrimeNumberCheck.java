package _07_PrimeNumber;

/**
 * This class provides functionality to check if a number is prime.
 */
public class _02_PrimeNumberCheck {

    /**
     * Checks if the given number is a prime number.
     * A prime number is greater than 1 and has no positive divisors other than 1 and itself.
     * @param num the number to check
     * @return true if the number is prime, false otherwise
     */
    private static boolean isPrimeNumber(int num) {
        // If number is less than or equal to 1, it's not prime
        if(num <= 1) {
            return false;
        }

        // Check for factors from 2 to num-1
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        // If no factors found, it's prime
        return true;
    }

    /**
     * The main method that executes the program.
     * It tests the isPrimeNumber method with the number 19 and prints the result.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Print whether 19 is prime
        System.out.println("prime status is: "  + isPrimeNumber(19));
    }
}
