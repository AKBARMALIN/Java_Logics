package _22_print_statements;

public class _05_PrintHelloWorldWithoutSemicolon {

    public static void main(String[] args) {

        // printf() prints the given string to the console
        // It returns a PrintStream object (System.out), not null

        // equals(null) will always return false
        // because a valid object can never be equal to null

        // We are using printf() inside an if condition
        // This trick helps us print output without using a semicolon (;)

        // Since printf() returns a non-null object,
        // .equals(null) evaluates to false
        // So, the if block will not execute
        if(System.out.printf("Hello World").equals(null)) {
            // This block will never execute
        }
    }
}
