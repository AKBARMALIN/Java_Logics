package _33_string_anagram;

import java.util.Arrays;

public class _01_String_Anagram {

    public static void main(String[] args) {

        // Test cases to verify the anagram logic
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("apple", "pabble")); // false
    }

    // Method to check whether two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {

        // Remove all whitespace from both strings
        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        // If lengths are not equal, they cannot be anagrams
        if(str1.length() != str2.length()) {
            return false;
        } else {
            // Convert both strings to lowercase and then to character arrays
            char[] arr1 = str1.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();

            // Sort both character arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted arrays
            // If equal, strings are anagrams
            return Arrays.equals(arr1, arr2);
        }
    }
}
