package _01_Swapping;

public class _05_Swapping {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        b = a + b - (a = b); // This line performs the swap in a single expression

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
