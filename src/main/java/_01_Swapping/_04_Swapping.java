package _01_Swapping;

public class _04_Swapping {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using bitwise XOR operator
        a = a ^ b; // a now holds the result of a XOR b
        b = a ^ b; // b now holds the original value of a
        a = a ^ b; // a now holds the original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
