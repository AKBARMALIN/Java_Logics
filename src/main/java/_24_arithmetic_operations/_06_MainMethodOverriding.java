package _24_arithmetic_operations;

public class _06_MainMethodOverriding {

    public static void main(String[] args) {

        // This is the actual entry point of the Java program
        System.out.println("Main Method-1");

        // Calling overloaded main method with String argument
        main("Hello");

        // Calling overloaded main method with int argument
        main(10);

        // Calling overloaded main method with two int arguments
        main(10, 20);
    }

    // Overloaded main method (NOT overriding)
    // Accepts a single String parameter
    public static void main(String args) {
        System.out.println("Main Method-2");
    }

    // Overloaded main method with int parameter
    public static void main(int args) {
        System.out.println("Main Method-3");
    }

    // Overloaded main method with two int parameters
    public static void main(int a, int b) {
        System.out.println("Main Method-4");
    }
}
