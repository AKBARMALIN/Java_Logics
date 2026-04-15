package _28_array_joining;

// Import Google Guava utility class for array operations
import com.google.common.collect.ObjectArrays;

public class _02_Arrays_Joining {

    public static void main(String[] args) {

        // Array of batsmen
        String[] batsman = {"Rohit", "Virat", "Dhawan", "Shreyas", "Sanju"};

        // Array of bowlers
        String[] bowlers = {"Hardik", "Bhuvi", "Bumrah", "Kuldeep", "Jaddu"};

        // Concatenate two arrays using Guava's ObjectArrays utility
        // It merges both arrays into a single array of type String
        String[] playingXI = ObjectArrays.concat(batsman, bowlers, String.class);

        // Iterate through the combined array and print each player
        for(String player : playingXI) {
            System.out.println(player);
        }
    }
}
