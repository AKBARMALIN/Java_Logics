package _31_language_translator;

import java.util.Map;

public class _01_language_translator {

    // Creating an immutable Map (fixed key-value pairs)
    // This map stores English text as key and Spanish translation as value
    private static final Map<String, String> EN_TO_ES = Map.of(
            "Hello Akbar", "Hola Akbar",
            "Good Morning Akbar", "Buenos dias Akbar",
            "How are you?", "Como estas?"
    );

    // Static method to translate given English text into Spanish
    public static String translate(String text) {

        // getOrDefault():
        // If the key (text) exists in the map → return translated value
        // If not → return the original text
        return EN_TO_ES.getOrDefault(text, text);
    }

    public static void main(String[] args) {

        // Calling translate method with different inputs

        // Found in map → returns Spanish translation
        System.out.println(translate("Hello Akbar"));

        // Found in map → returns Spanish translation
        System.out.println(translate("Good Morning Akbar"));

        // Found in map → returns Spanish translation
        System.out.println(translate("How are you?"));
    }
}
