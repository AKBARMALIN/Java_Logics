package _16_Character_Occurences;

public class _03_CountCharacterOccurence {

    public static void main(String[] args) {
        getCharacterOccurnce("I love coding and testing", 'o');
        getCharacterOccurnce("I love coding and testing", 'i');
        getCharacterOccurnce("I love coding and testing", 'z');
    }

    public static void getCharacterOccurnce(String str, char val) {
        int count = 0;
        char[] chars = str.toCharArray();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == val) {
                count++;
            }
        }

        System.out.println("Character: " + val + ", occurrence: " + count);
    }
}
