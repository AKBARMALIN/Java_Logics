package _25_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_IteratorAndForEachRemaining {

    public static void main(String[] args) {

        // Creating a List to store TV series names
        List<String> tvSeries = new ArrayList<>();

        // Adding elements to the list
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        // Getting an Iterator object to traverse the list
        Iterator<String> it = tvSeries.iterator();

        // Using forEachRemaining() method with lambda expression
        // This will iterate through all remaining elements in the iterator
        // 'shows' represents each element in the list
        it.forEachRemaining(shows -> System.out.println(shows));
    }
}
