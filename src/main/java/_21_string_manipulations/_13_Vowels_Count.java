package _21_string_manipulations;

public class _13_Vowels_Count {

    public static boolean isVowel(char c) {
        return
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        String str = "testing";

        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Vowel count is: " + count);
    }
}
