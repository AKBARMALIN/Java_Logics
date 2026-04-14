package _25_iterators;

import java.util.ArrayList;
import java.util.List;

public class _04_ForEachLoop {

    public static void main(String[] args) {

        // Creating a List to store TV series names
        List<String> tvSeries = new ArrayList<>();

        // Adding elements to the list
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        // Using enhanced for-each loop to iterate through the list
        // 'show' represents each element in the list one by one
        for(String show : tvSeries) {
            // Printing each TV series name
            System.out.println(show);
        }
    }
}
