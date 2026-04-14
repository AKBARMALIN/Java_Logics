package _25_iterators;

import java.util.ArrayList;
import java.util.List;

public class _01_ForEachAndLambda {

    public static void main(String[] args) {

        // Creating a List to store TV series names
        List<String> tvSeries = new ArrayList<>();

        // Adding elements to the list
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        // Using forEach() method (introduced in Java 8)
        // Lambda expression is used to iterate through each element
        // 'shows' represents each element in the list
        tvSeries.forEach(shows -> System.out.println(shows));
    }
}
