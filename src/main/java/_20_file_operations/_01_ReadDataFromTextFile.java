package _20_file_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _01_ReadDataFromTextFile {

    public static void main(String[] args) throws IOException {

        // FileReader is used to read the file character by character
        // System.getProperty("user.dir") returns the current project directory
        FileReader fr = new FileReader(System.getProperty("user.dir")+"/src/main/resources/test.txt");

        // BufferedReader improves performance by reading text in chunks (buffer)
        BufferedReader br = new BufferedReader(fr);

        // Variable to store each line read from the file
        String str;

        // readLine() reads one line at a time
        // It returns null when end of file is reached
        while((str = br.readLine()) != null) {

            // Printing each line to console
            System.out.println(str);
        }
        br.close();
    }
}
