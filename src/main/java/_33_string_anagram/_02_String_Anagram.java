package _33_string_anagram;

import java.util.Arrays;
import java.util.Scanner;

public class _02_String_Anagram {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read first string
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        // Read second string
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        /*
         * Convert both strings to lowercase to make comparison case-insensitive
         * Then convert them into character arrays
         */
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        /*
         * Convert sorted character arrays back to strings
         * so that we can easily compare them using equals()
         */
        String s1 = new String(arr1);
        String s2 = new String(arr2);

        /*
         * If both sorted strings are equal,
         * then the original strings are anagrams
         */
        if(s1.equals(s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
