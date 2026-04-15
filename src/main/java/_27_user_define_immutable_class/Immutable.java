package _27_user_define_immutable_class;

// final class → cannot be extended (important for immutability)
public final class Immutable {

    // private variable → cannot be accessed directly from outside
    private int i;

    // Constructor to initialize value
    Immutable(int i) {
        this.i = i;
    }

    // Method to "modify" value
    // Instead of changing existing object, it returns a new object (immutability concept)
    public Immutable modify(int i) {

        // If the new value is same as current value
        // return the same object (no need to create new object)
        if(this.i == i) {
            return this;
        } else {
            // If value is different, create and return a new object
            return new Immutable(i);
        }
    }

    public static void main(String[] args) {

        // Create Immutable object with value 10
        Immutable I1 = new Immutable(10);

        // Try to modify value to 100 → creates new object
        Immutable I2 = I1.modify(100);

        // Try to modify value to same value (10) → returns same object
        Immutable I3 = I1.modify(10);

        // Compare references
        System.out.println(I1 == I2); // false → different objects
        System.out.println(I1 == I3); // true → same object
    }
}
