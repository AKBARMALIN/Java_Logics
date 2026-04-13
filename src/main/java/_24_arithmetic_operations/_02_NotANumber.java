package _24_arithmetic_operations;

public class _02_NotANumber {

    public static void main(String[] args) {

        // 0.0 / 0.0 is mathematically undefined
        // Java follows IEEE 754 standard → result is NaN (Not a Number)
        System.out.println(0.0 / 0.0);

        // Square root of a negative number is not a real number
        // Hence Java returns NaN
        System.out.println(Math.sqrt(-1));

        // NaN is NOT equal to anything, including itself
        // So this returns false
        System.out.println(Float.NaN == Float.NaN);

        // NaN is always considered not equal to anything
        // So this returns true
        System.out.println(Float.NaN != Float.NaN);
    }
}
