package _28_array_joining;

import java.util.Arrays;
import java.util.stream.Stream;

public class _01_Arrays_Joining {

    public static void main(String[] args) {

        // Array of batsmen
        String[] batsman = {"Rohit", "Virat", "Dhawan", "Shreyas", "Sanju"};

        // Array of bowlers
        String[] bowlers = {"Hardik", "Bhuvi", "Bumrah", "Chahal", "Jaddu"};

        // Convert batsman array into Stream
        Stream<String> sBat = Arrays.stream(batsman);

        // Convert bowlers array into Stream
        Stream<String> sBow = Arrays.stream(bowlers);

        // Concatenate both streams into one stream
        // Then convert the combined stream back to array
        String[] playingXI = Stream.concat(sBat, sBow)
                .toArray(size -> new String[size]);

        // Iterate through final array and print each player name
        for(String s : playingXI) {
            System.out.println(s);
        }
    }
}
