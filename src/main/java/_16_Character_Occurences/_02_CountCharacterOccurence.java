package _16_Character_Occurences;

public class _02_CountCharacterOccurence {

    public static void main(String[] args) {
        String str = "I love coding and testing";
        getCharacterOccurnce(str, 'o');
        getCharacterOccurnce(str, 'i');
        getCharacterOccurnce(str, 'z');
    }

    public static void getCharacterOccurnce(String str, char val) {
        int count = 0;

        char[] chars = str.toCharArray();

        for(char ch : chars) {
            if(ch == val) {
                count++;
            }
        }
        System.out.println("Character: " + val + ", Occurrence: " + count);
    }
}
