package _17_SearchingElements;

public class _01_LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50, 30};

        int searchElement = 30;
        boolean status = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement) {
                status = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if(!status) {
            System.out.println("Element not found in the array.");
        }
    }
}
