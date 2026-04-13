package _22_PrintStatements;

public class _03_PrintHelloWorldWithoutSemicolon {

    public static void main(String[] args) {

        // printf() prints the given string
        // It returns a PrintStream object (not null)

        // We are using printf() inside an if condition
        // This helps us avoid using a semicolon (;) after the print statement

        // Condition checks if returned value is null
        // Since printf() does NOT return null, condition becomes false
        // So, the if block will not execute
        if(System.out.printf("Hello World") == null) {
            // This block will never execute
        }
    }
}
