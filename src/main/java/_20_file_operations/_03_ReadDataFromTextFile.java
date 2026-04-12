package _20_file_operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _03_ReadDataFromTextFile {

    public static void main(String[] args) throws FileNotFoundException {

        // Creating a File object pointing to the file path
        // System.getProperty("user.dir") returns the current project directory
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/test-3.txt");

        // Scanner is used to read data from the file
        Scanner sc = new Scanner(file);

        // Setting delimiter as end of file (\Z means end of input)
        // This helps to read the entire file content at once
        sc.useDelimiter("\\Z");

        // Reads and prints the complete file content
        System.out.println(sc.next());

        // Note: Scanner should ideally be closed to avoid resource leak
        sc.close();
    }
}
