package _16_Character_Occurences;

public class _06_CountCharacterOccurence {

    public static void main(String[] args) {
        String str = "testing solutions by akbar automation labs";
        System.out.println("Character: s, Occurrence: " + getCharCount(str, 's'));
        System.out.println("Character: s and a, Occurrence: " + getCharCount(str, 's', 'a'));
    }

    public static long getCharCount(String str, char c) {
        return str.chars().filter(e -> (char)e == c).count();
    }

    public static long getCharCount(String str, char c1, char c2) {
        return str.chars().filter(e -> (char)e == c1 || (char)e == c2).count();
    }
}
