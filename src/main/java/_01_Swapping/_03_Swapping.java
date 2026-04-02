package _01_Swapping;

public class _03_Swapping {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a * b; // a now holds the product of a and b
        b = a / b; // b now holds the original value of a
        a = a / b; // a now holds the original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}
