package _17_SearchingElements;

public class _02_BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int l = 0;
        int h = arr.length - 1;

        int key = 90;
        boolean status = false;

        while(l <= h) {
            int mid = (l + h) / 2;

            if(arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                status = true;
                break;
            }

            if(arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        if(!status) {
            System.out.println("Element not found in the array.");
        }
    }
}
