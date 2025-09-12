/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0008;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author hxhba
 */
public class TextCounter {
    private final String inputText;

    public TextCounter(String inputText) {
        this.inputText = inputText;
    }

    public Map<String, Integer> countWords() {
        Map<String, Integer> wordCount = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(inputText);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public Map<Character, Integer> countLetters() {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (int i = 0; i < inputText.length(); i++) {
            char c = Character.toLowerCase(inputText.charAt(i));
            if (Character.isLetter(c)) {
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }
        return letterCount;
    }
}
