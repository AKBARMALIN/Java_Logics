package _32_static_info;

/*
    Q: How can we create objects if the constructor is private?
    A: Yes, we can create objects from within the same class using:
       - Static block
       - Static methods
 */
class StaticBlockQuestion_1 {

    int age;

    // Private constructor: prevents object creation from outside this class
    private StaticBlockQuestion_1() {
        age = 30; // default initialization
    }

    // Static block: executes once when the class is loaded
    static {
        // Object created inside the same class (allowed even if constructor is private)
        StaticBlockQuestion_1 obj1 = new StaticBlockQuestion_1();
        obj1.age = 45; // Modifying the value

        // Note: This object is not returned or stored anywhere
        // It exists only during static initialization
    }

    // Static method to create and return object data
    public static int createObject() {
        // Creating another object using private constructor
        StaticBlockQuestion_1 obj2 = new StaticBlockQuestion_1();

        // Updating value
        obj2.age = 40;

        // Returning age instead of object
        return obj2.age;
    }
}

public class _01_TestStaticCode {

    public static void main(String[] args) {

        // Calling static method without creating object of the class
        int age = StaticBlockQuestion_1.createObject();

        // Printing returned value
        System.out.println(age);
    }
}
