package _25_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_Iterator {

    public static void main(String[] args) {

        // Creating a List to store TV series names
        List<String> tvSeries = new ArrayList<>();

        // Adding elements to the list
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        // Creating an Iterator to traverse the list
        Iterator<String> it = tvSeries.iterator();

        // Using while loop to iterate through the list
        // hasNext() checks if there is another element
        while(it.hasNext()) {

            // next() returns the next element in the list
            // and moves the cursor forward
            System.out.println(it.next());
        }
    }
}
