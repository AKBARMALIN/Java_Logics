package _22_print_statements;

public class _01_PrintOneToHundred {

    public static void main(String[] args) {

        // 'A' has ASCII value 65
        // So 'A' / 'A' = 65 / 65 = 1
        // Hence, variable 'one' gets value 1 without directly using number 1
        int one = 'A'/'A';

        // String contains 10 characters (9 dots + 1 semicolon)
        String s = ".........;";

        // s.length() = 10
        // s.length() * s.length() = 10 * 10 = 100

        // Loop starts from 1 and runs till 100
        for(int i = one; i <= s.length() * s.length(); i++) {

            // Prints numbers from 1 to 100
            System.out.println(i);
        }
    }
}
