package _24_arithmetic_operations;

public class _01_DivideByZero {

    public static void main(String[] args) {

        // Integer division by zero → Runtime exception
        // Throws ArithmeticException: / by zero
        System.out.println(9 / 0);

        // Integer division 0 / 0 → also ArithmeticException
        System.out.println(0 / 0);

        //------------------------------------------------
        // Floating-point division behaves differently

        // 0.0 / 0 → Not a Number (NaN)
        // Represents undefined mathematical result
        System.out.println(0.0 / 0);

        // 0.0 / 0.0 → NaN
        System.out.println(0.0 / 0.0);

        // ----------------------------------------------------
        // Positive number / 0 (floating-point) → Infinity

        // Double divided by zero → Infinity
        System.out.println(9.0 / 0);

        // Float divided by zero → Infinity
        System.out.println(12.33f / 0);

        // Float divided by zero → Infinity // Infinity
        // Integer divided by double zero → treated as double → Infinity
        System.out.println(10 / 0.0);

        // Double divided by zero → Infinity
        System.out.println(10.999 / 0);
    }
}