package _20_file_operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _02_ReadDataFromTextFile {

    public static void main(String[] args) throws FileNotFoundException {

        // Creating a File object with the path to the text file
        // System.getProperty("user.dir") returns the current project directory
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/test-2.txt");

        // Scanner object to read data from the file
        Scanner sc = new Scanner(file);

        // Loop to read the file line by line
        // hasNextLine() checks if there is another line available
        while(sc.hasNextLine()) {

            // nextLine() reads the current line and moves to the next line
            System.out.println(sc.nextLine());
        }

        // Best practice: close the scanner to avoid resource leaks
        sc.close();
    }
}
