package _16_Character_Occurences;

public class _04_CountCharacterOccurence {

    public static void main(String[] args) {
        String str = "I love coding and testing";
        getCharacterOccurence(str, "o");
        getCharacterOccurence(str, "i");
        getCharacterOccurence(str, "z");
    }

    public static void getCharacterOccurence(String str, String val) {
        long count = str.chars().mapToObj(e -> String.valueOf((char)e))
                        .filter(e -> e.equals(val)).count();
        System.out.println("Character: " + val + ", Occurrence: " + count);
    }
}
