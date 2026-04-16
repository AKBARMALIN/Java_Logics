package _29_user_defined_class_logics;

// This class represents a Student entity with basic attributes
public class Student {

    // Private variables (Encapsulation)
    private String name;
    private int rollNo;
    private int marks;
    private int age;

    // Default constructor
    public Student() {
        super();
    }

    // Parameterized constructor to initialize student details
    public Student(String name, int rollNo, int marks, int age) {
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.age = age;
    }

    // Getter method to return student name
    public String getName() {
        return name;
    }

    // Getter method to return roll number
    public int getRollNo() {
        return rollNo;
    }

    // Getter method to return marks
    public int getMarks() {
        return marks;
    }

    // Getter method to return age
    public int getAge() {
        return age;
    }

    // Overriding toString() method to print student details in readable format
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", age=" + age + "]";
    }

}