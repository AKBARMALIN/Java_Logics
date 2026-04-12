package _20_file_operations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _04_WriteDataIntoTextFile {

    public static void main(String[] args) throws IOException {

        // Creating FileWriter object to write data into a file
        // System.getProperty("user.dir") gives the current project directory
        // File will be created at: project-folder/src/main/resources/test-4.txt
        FileWriter fw = new FileWriter(System.getProperty("user.dir") + "/src/main/resources/test-4.txt");

        // BufferedWriter is used to improve performance (writes data efficiently)
        BufferedWriter bw = new BufferedWriter(fw);

        // Writing first line into the file
        bw.write("This is the first line.");

        // Moves cursor to next line
        bw.newLine();

        // Writing second line into the file
        bw.write("10");

        // Message to console after writing
        System.out.println("Finished writing data into the text file.");

        // Closing BufferedWriter (also closes FileWriter internally)
        // Important to release resources and ensure data is saved
        bw.close();
    }
}
