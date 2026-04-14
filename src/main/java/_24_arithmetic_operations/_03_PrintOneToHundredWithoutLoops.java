package _24_arithmetic_operations;

public class _03_PrintOneToHundredWithoutLoops {

    // Recursive method to print numbers starting from 'num' up to 100
    public static void printNum(int num) {

        // Base condition: continue only if num is less than or equal to 100
        if (num <= 100) {

            // Print the current number
            System.out.println(num);

            // Increment the number
            num++;

            // Recursive call with updated value
            printNum(num);
        }
        // When num becomes greater than 100, recursion stops automatically
    }

    public static void main(String[] args) {

        // Calling the recursive method starting from 1
        printNum(1);
    }
}
