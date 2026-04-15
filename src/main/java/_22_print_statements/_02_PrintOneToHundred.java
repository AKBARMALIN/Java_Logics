package _22_print_statements;

public class _02_PrintOneToHundred {

    public static void main(String[] args) {

        // 'A' has ASCII value 65
        // 'A' / 'A' = 65 / 65 = 1
        // So variable 'one' gets value 1 without directly using numeric literal
        int one = 'A'/'A';

        // 'd' has ASCII value 100
        // Loop runs from 1 to 100
        for(int i = one; i <= 'd'; i++) {

            // Prints numbers from 1 to 100
            System.out.println(i);
        }
    }
}
