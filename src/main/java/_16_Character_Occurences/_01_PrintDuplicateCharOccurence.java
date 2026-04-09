package _16_Character_Occurences;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_PrintDuplicateCharOccurence {
    public static void main(String[] args) {
        printDuplicateCharacterOccurence("hello world");
        printDuplicateCharacterOccurence("");
        printDuplicateCharacterOccurence(null);
        printDuplicateCharacterOccurence("a");
    }

    public static void printDuplicateCharacterOccurence(String str) {
        if (str == null) {
            System.out.println("Null String provided");
            return;
        }

        if(str.isEmpty()) {
            System.out.println("Empty String provided");
            return;
        }

        if(str.length() == 1) {
            System.out.println("Only one character provided, no duplicates possible");
            return;
        }

        char[] words = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for(Character ch : words) {
            if(charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet) {
            if(entry.getValue() > 1) {
                System.out.println("Character: " + entry.getKey() + ", Occurrence: " + entry.getValue());
            }
        }
    }
}
