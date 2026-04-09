package _18_SortingElements;

import java.util.Arrays;

public class _01_BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};

        System.out.println("Before Sorting: "+ Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 ; j++) {
                if(arr[j] > arr[j +1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting: "+ Arrays.toString(arr));
    }
}
