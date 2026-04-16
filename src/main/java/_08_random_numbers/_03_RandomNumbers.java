package _08_random_numbers;

import org.apache.commons.text.RandomStringGenerator;

/**
 * This class demonstrates generating random numeric and alphabetic strings using Apache Commons Text library.
 */
public class _03_RandomNumbers {

    public static void main(String[] args) {
        // Create a RandomStringGenerator for numeric characters (0-9)
        RandomStringGenerator numericGen = new RandomStringGenerator.Builder()
                                                .withinRange('0', '9')
                                                .build();

        // Generate a random numeric string of length 5
        String randomNumeric = numericGen.generate(5);
        System.out.println("Random Numeric String: " + randomNumeric);

        // Create a RandomStringGenerator for alphabetic characters (a-z, A-Z)
        RandomStringGenerator alphaGen = new RandomStringGenerator.Builder()
                                                    .withinRange(new char[][] {{'a', 'z'}, {'A', 'Z'}})
                                                    .build();
        String randomAlpha = alphaGen.generate(5);
        System.out.println("Random Alphabetic String: " + randomAlpha);
    }
}
