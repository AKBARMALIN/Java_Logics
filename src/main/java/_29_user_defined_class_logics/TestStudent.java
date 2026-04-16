package _29_user_defined_class_logics;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {

        // Creating Student objects
        Student s1 = new Student("Tom", 1, 90, 15);
        Student s2 = new Student("Peter", 2, 80, 16);
        Student s3 = new Student("Lisa", 3, 95, 17);
        Student s4 = new Student("Robby", 4, 100, 15);
        Student s5 = new Student("Akbar", 5, 50, 14);

        // Creating a List to store Student objects
        List<Student> studentList = new ArrayList<>();

        // Adding students to the list
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        // Printing size of the list
        System.out.println(studentList.size());

        // Traditional for-each loop to print all students
        for(Student s : studentList) {
            System.out.println(s); // Calls toString() method
        }

        System.out.println();

        // Using Stream API to print all students
        studentList.stream().forEach(s -> System.out.println(s));

        System.out.println();

        // Filtering students who have marks greater than 80
        studentList.stream().filter(e -> e.getMarks() > 80)
                .forEach(e -> System.out.println(e.getName() + " : " + e.getMarks()));

        System.out.println();

        // Finding the highest marks using Stream API
        int highestMarks = studentList.stream()
                                    .map(e -> e.getMarks()) // Extract marks
                                    .max(Integer::compare) // Find maximum
                                    .get(); // Get value from Optional

        System.out.println(highestMarks);

        System.out.println();

        // Printing student(s) who have highest marks
        studentList.stream()
                .filter(e -> e.getMarks() == highestMarks)
                .forEach(e -> System.out.println(e));
    }
}
