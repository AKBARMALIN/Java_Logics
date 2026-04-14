package _24_arithmetic_operations;

public class _04_PrintOneToHundredWithoutLoops {

    // Recursive method to print numbers from startNumber to endNumber
    public static void printNumber(int startNumber, int endNumber) {

        // Base condition: continue only if startNumber is less than or equal to endNumber
        if(startNumber <= endNumber) {

            // Print the current number
            System.out.println(startNumber);

            // Increment the number
            startNumber++;

            // Recursive call with updated value
            printNumber(startNumber, endNumber);
        }
    }

    public static void main(String[] args) {

        // Calling the recursive method to print numbers from 1 to 100
        printNumber(1, 100);
    }
}
