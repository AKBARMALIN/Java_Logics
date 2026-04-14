package _25_iterators;

import java.util.ArrayList;
import java.util.List;

public class _05_LoopWithIndex {

    public static void main(String[] args) {

        // Creating a List to store TV series names
        List<String> tvSeries = new ArrayList<>();

        // Adding elements to the list
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        // Looping through the list using index-based for loop
        // 'i' represents the index of each element
        for(int i = 0; i < tvSeries.size(); i++) {

            // Printing index along with the corresponding element
            // tvSeries.get(i) fetches the element at index 'i'
            System.out.println(i + ": " + tvSeries.get(i));
        }
    }
}
