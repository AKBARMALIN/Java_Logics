package _22_print_statements;

public class _04_PrintHelloWorldWithoutSemicolon {

    public static void main(String[] args) {

        // append() prints the given string to the console
        // It returns a PrintStream object (same as System.out), not null

        // We are using append() inside an if condition
        // This trick allows printing without using a semicolon (;)

        // Condition checks if returned value is null
        // Since append() returns a non-null object, condition becomes false
        // So, the if block will not execute
        if(System.out.append("Hello World") == null) {
            // This block will never execute
        }
    }
}
