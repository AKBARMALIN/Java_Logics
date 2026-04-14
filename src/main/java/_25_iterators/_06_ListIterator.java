package _25_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class _06_ListIterator {

    public static void main(String[] args) {

        // Creating a List to store TV series names
        List<String> tvSeries = new ArrayList<>();

        // Adding elements to the list
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        // Creating ListIterator starting from the end of the list
        // tvSeries.size() sets the cursor at the last position
        ListIterator<String> ltr = tvSeries.listIterator(tvSeries.size());

        // Traversing the list in reverse direction using hasPrevious() and previous()
        while(ltr.hasPrevious()) {
            System.out.println(ltr.previous());
        }

        // Printing separator line
        System.out.println("------------------");

        // Traversing the list in forward direction using hasNext() and next()
        // Note: After reverse traversal, cursor is at the beginning
        while(ltr.hasNext()) {
            System.out.println(ltr.next());
        }
    }
}
