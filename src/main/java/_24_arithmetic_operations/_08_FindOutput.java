package _24_arithmetic_operations;

public class _08_FindOutput {

    public static void main(String[] args) {

        // Default value used here is 1 (from the final "- 1")
        // The expression becomes:
        // (byte)(+(char)(-(int)(+(long)(-1))))

        // Simplifying:
        // -1 → apply unary operations step by step
        // +(long)(-1) → -1
        // -(int)(-1) → +1
        // +(char)(1) → 1
        // (byte)(1) → 1
        int i = (byte) + (char) - (int) + (long) - 1;

        // Final output will be 1
        System.out.println("The value of i is: " + i);
    }
}
