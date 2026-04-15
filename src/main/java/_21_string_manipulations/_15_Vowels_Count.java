package _21_string_manipulations;

import com.google.common.base.CharMatcher;

public class _15_Vowels_Count {

    public static void main(String[] args) {

        String str = "Java Examples";
        int count = CharMatcher.anyOf("aeiouAEIOU").countIn(str);
        System.out.println("Vowel count is: " + count);

    }
}
