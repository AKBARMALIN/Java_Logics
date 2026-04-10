package _09_FactorialNumber;

public class _01_FactorialNumber {

    public static void main(String[] args) {

        // Number for which factorial needs to be calculated
        int num = 5;

        // Variable to store factorial result (initialized to 1)
        long factorial = 1;

        /*
         * Loop from num down to 1
         * Multiply each value with factorial
         */
        for(int i = num; i >= 1; i--) {
            // factorial = factorial * current number
            factorial = factorial * i;
        }

        // Print the factorial result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
