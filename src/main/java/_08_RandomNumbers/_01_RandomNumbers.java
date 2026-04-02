package _08_RandomNumbers;

import java.util.Random;

/**
 * This class demonstrates generating random integers and doubles using Java's Random class.
 */
public class _01_RandomNumbers {

    public static void main(String[] args) {

        // Create a Random instance
        Random rand = new Random();

        // Generate a random integer
        int randomInt = rand.nextInt();

        // Print the random integer
        System.out.println(randomInt);

        // Generate a random double between 0.0 and 1.0
        double randDouble = rand.nextDouble();

        // Print the random double
        System.out.println(randDouble);
    }
}
