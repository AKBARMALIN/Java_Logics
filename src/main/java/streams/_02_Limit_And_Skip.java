package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _02_Limit_And_Skip {

    public static void main(String[] args) {

        // Creating a list of integers (with duplicates)
        List<Integer> number = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19,  3, 40);

        // 🔹 limit(5) → takes only the first 5 elements from the stream
        List<Integer> l = number
                .stream()
                .limit(5) // restricts stream to first 5 elements
                .collect(Collectors.toList()); // collect into List

        System.out.println("Limit: " + l);

        // 🔹 Sum of first 5 elements using reduce()
        int sum = number
                .stream()
                // first 5 elements
                .limit(5)
                // 0 → initial value
                // (a, b) -> a + b → adds elements one by one
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of first 5 numbers: " + sum);

        // 🔹 skip(5) → skips the first 5 elements and returns the rest
        List<Integer> s = number
                .stream()
                .skip(5) // ignore first 5 elements
                .collect(Collectors.toList());

        System.out.println("Skip: " + s);

        // 🔹 Sum of remaining elements after skipping first 5
        int sum2 = number
                .stream()
                .skip(5) // skip first 5 elements
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of numbers after skipping first 5: " + sum2);
    }
}
