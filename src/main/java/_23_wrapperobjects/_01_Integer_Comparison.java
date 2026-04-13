package _23_wrapperobjects;

public class _01_Integer_Comparison {

    public static void main(String[] args) {

        // Integer values between -128 to 127 are cached by JVM
        // This is called Integer Cache

        // Both I and J refer to the same cached object (127 is within range)
        Integer I = 127;
        Integer J = 127;

        // Values outside cache range create new objects in Heap
        // So K and L refer to different objects
        Integer K = 128;
        Integer L = 128;

        // == compares reference (memory address)

        // true → both refer to same cached object
        System.out.println(I == J);

        // false → different objects in memory
        System.out.println(K == L);
    }
}
