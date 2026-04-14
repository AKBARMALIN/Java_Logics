package _24_arithmetic_operations;

public class _07_MinValuesOfDoubleAndFloat {

    public static void main(String[] args) {

        // Printing minimum positive value for Double
        // NOTE: This is NOT the most negative value
        // It is the smallest positive non-zero value (≈ 4.9E-324)
        System.out.println(Double.MIN_VALUE);

        // Printing minimum positive value for Float
        // Smallest positive non-zero value (≈ 1.4E-45)
        System.out.println(Float.MIN_VALUE);

        // Printing minimum value for Long (most negative value)
        System.out.println(Long.MIN_VALUE);

        // Printing minimum value for Integer (most negative value)
        System.out.println(Integer.MIN_VALUE);


        // Comparing Double.MIN_VALUE with 0.0
        // Since Double.MIN_VALUE is a very small positive number,
        // 0.0 is smaller → result will be 0.0
        System.out.println(Math.min(Double.MIN_VALUE, 0.0));

        // Comparing Integer.MIN_VALUE with 0
        // Integer.MIN_VALUE is negative → smaller than 0
        System.out.println(Math.min(Integer.MIN_VALUE, 0));

        // Comparing Double.MIN_VALUE with NEGATIVE_INFINITY
        // NEGATIVE_INFINITY is smaller than any number
        System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));

    }
}
