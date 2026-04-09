package _17_SearchingElements;

import java.util.Arrays;

public class _03_BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int binarySearch = Arrays.binarySearch(arr, 90);
        System.out.println("Element found at index: " + binarySearch);
    }
}
