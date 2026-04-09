package _16_Character_Occurences;

import org.apache.commons.lang3.StringUtils;

public class _05_CountCharacterOccurence {

    public static void main(String[] args) {
        String str = "I love coding and testing";
        int count = StringUtils.countMatches(str, "o");
        System.out.println("Character: o, Occurrence: " + count);
    }
}
