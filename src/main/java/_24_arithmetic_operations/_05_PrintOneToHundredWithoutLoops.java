package _24_arithmetic_operations;

import java.util.stream.IntStream;

public class _05_PrintOneToHundredWithoutLoops {

    public static void main(String[] args) {

        // IntStream.range(1, 101) generates numbers from 1 to 100
        // (start is inclusive, end is exclusive → 101 is not included)

        // forEach() is used to iterate through each number
        // Lambda expression prints each element
        IntStream.range(1, 101).forEach(e -> System.out.println(e));
    }
}
