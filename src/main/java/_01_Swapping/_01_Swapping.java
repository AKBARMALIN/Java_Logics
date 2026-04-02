package _01_Swapping;

public class _01_Swapping {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        temp = b;
        b = a;
        a = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
