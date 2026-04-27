package _30_finally_vs_finalize;

public class _01_FinallyBlock {

    public static void main(String[] args) {

        // Calling test1 → exception handled + finally executed
        test1();
        System.out.println();

        // Calling test2 → no exception + finally still executed
        test2();
        System.out.println();

        // Calling test3 → exception occurs and handled + finally executed
        test3(10);
        System.out.println();

        // Calling test4 → no exception occurs + finally executed
        test4(10);
    }

    // 🔹 Case 1: Exception occurs and is handled
    public static void test1() {
        try {
            System.out.println("Inside test1 try block");

            // Manually throwing RuntimeException
            throw new RuntimeException("test");
        } catch(Exception e) {
            // Catch block handles the exception
            System.out.println("Inside test1 catch block");
        } finally {
            // finally block always executes
            System.out.println("Inside test1 finally block");
        }
    }

    // 🔹 Case 2: No exception occurs
    public static void test2() {
        try {
            System.out.println("Inside test2 try block");
        } finally {
            // Even without exception, finally executes
            System.out.println("Inside test2 finally block");
        }
    }

    // 🔹 Case 3: Exception occurs (ArithmeticException) and is handled
    public static void test3(int i) {
        try {
            System.out.println("Inside test3 try block");

            // Division by zero → ArithmeticExceptio
            int k = i / 0;
        } catch(ArithmeticException e) {
            // Exception handled here
            System.out.println("Got the arithmetic exception");
            System.out.println("Division by zero");
        } finally {
            // Always executes
            System.out.println("Inside test3 finally block");
        }
    }

    // 🔹 Case 4: No exception occurs
    public static void test4(int i) {
        try {
            System.out.println("Inside test4 try block");
        } catch(NullPointerException e) {
            // This block will NOT execute (no exception thrown)
            System.out.println("Got the arithmetic exception");
            System.out.println("Division by zero");
        } finally {
            // finally still executes
            System.out.println("Inside test4 finally block");
        }
    }
}
