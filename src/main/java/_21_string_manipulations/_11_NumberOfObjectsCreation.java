package _21_string_manipulations;

public class _11_NumberOfObjectsCreation {

    public static void main(String[] args) {

        // String literals are stored in String Constant Pool (SCP)

        // Only ONE object is created in SCP for "Hello World"
        String s1 = "Hello World";

        // No new object created, s2 refers to the same SCP object as s1
        String s2 = "Hello World";

        // s3 refers to the same object as s1 (no new object created)
        String s3 = s1;

        // 'new' keyword creates a new object in Heap memory
        // AND also ensures literal exists in SCP (if not already present)
        // Here: 1 object in Heap (new), SCP already has "Hello World"
        String s4 = new String("Hello World");

        // Another new object is created in Heap
        // So now 2 separate Heap objects (s4 and s5)
        String s5 = new String("Hello World");

        // == compares memory references (addresses), not values

        // true → both refer to same SCP object
        System.out.println(s1 == s2);

        // true → s3 is assigned from s2/s1 (same reference)
        System.out.println(s2 == s3);

        // true → same reference again
        System.out.println(s1 == s3);

        // false → different Heap objects
        System.out.println(s4 == s5);

        // false → s1 is from SCP, s5 is from Heap
        System.out.println(s1 == s5);
    }
}
