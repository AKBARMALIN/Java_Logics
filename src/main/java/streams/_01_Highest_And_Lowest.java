package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Student class representing a custom object
class Student {

    private String name;
    private int marks;

    // Constructor to initialize Student object
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for marks
    public int getMarks() {
        return marks;
    }

    // toString() method to print student details
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class _01_Highest_And_Lowest {

    public static void main(String[] args) {

        // Creating list of Student objects
        List<Student> students = Arrays.asList(
                new Student("Akbar", 85),
                new Student("John", 92),
                new Student("Alice", 78),
                new Student("Bob", 90),
                new Student("Charlie", 88),
                new Student("David", 95),
                new Student("Eve", 80),
                new Student("Frank", 82),
                new Student("Grace", 91)
        );

        // Find the student with the highest marks
        Integer highestMarksStudent = students
                // Convert Student → marks (Integer stream)
                .stream()
                .map(Student::getMarks)
                // Sort in descending order
                .sorted(Collections.reverseOrder())
                // Remove duplicate marks (if any)
                .distinct()
                // Get first element (highest)
                .findFirst()
                // If no value found, return null
                .orElse(null);

        System.out.println("Student with the highest marks: " + highestMarksStudent);

        // Find the student with the second highest marks
        Integer secondhigHestMarksStudent = students
                .stream()
                .map(Student::getMarks)
                .sorted(Collections.reverseOrder())
                .distinct()
                .skip(1) // Skip first (highest) element
                .findFirst()  // Get next element
                .orElse(null);

        System.out.println("Student with the second highest marks: " + secondhigHestMarksStudent);

        // Find the student with the lowest marks
        Integer lowestMarksStudent = students
                .stream()
                .map(Student::getMarks)
                // Default sorting is ascending
                .sorted()
                .distinct()
                // First element is lowest
                .findFirst()
                .orElse(null);

        System.out.println("Student with the lowest marks: " + lowestMarksStudent);

        // Find the student with the second lowest marks
        Integer secondLowestMarksStudent = students
                .stream()
                .map(Student::getMarks)
                .sorted()
                .distinct()
                // Skip lowest element
                .skip(1)
                // Get next element
                .findFirst()
                .orElse(null);

        System.out.println("Student with the second lowest marks: " + secondLowestMarksStudent);

    }
}
