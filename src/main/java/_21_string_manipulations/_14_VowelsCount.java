package _21_string_manipulations;

import java.util.function.IntPredicate;

public class _14_VowelsCount {

    public static void main(String[] args) {

        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int c) {
                   return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                             c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
            }
        };

        String test = "akbar automation labs";
        long count = test.chars().filter(vowel).count();

        System.out.println("Vowel count is: " + count);

    }
}
