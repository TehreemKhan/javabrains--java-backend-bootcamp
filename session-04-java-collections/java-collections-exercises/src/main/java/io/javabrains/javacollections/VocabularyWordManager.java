package io.javabrains.javacollections;

import java.util.*;

// Implement the VocabularyWordManager using a SortedSet internally

public class VocabularyWordManager {

    private SortedSet<String> set;


    public SortedSet<String> getSet() {
        return set;
    }

    public VocabularyWordManager(Collection<String> words) {
//        throw new RuntimeException("Not implemented");
        this.set = new TreeSet<>(words);
    }

    public String getFirstWord() {
//        throw new RuntimeException("Not implemented");
        return this.set.first();
    }

    public String getLastWord() {
//        throw new RuntimeException("Not implemented");
        return this.set.last();
    }

    public SortedSet<String> getWordsBefore(String word) {
//        throw new RuntimeException("Not implemented");
        return this.set.headSet(word);
    }

    public SortedSet<String> getWordsAfter(String word) {
//        throw new RuntimeException("Not implemented");
        return this.set.tailSet(word);
    }

    public SortedSet<String> getWordsBetween(String startWord, String endWord) {
//        throw new RuntimeException("Not implemented");
        return this.set.subSet(startWord, endWord);
    }

    public static void main(String[] args) {
        VocabularyWordManager vocab = new VocabularyWordManager(
                Set.of("apple",
                        "banana",
                        "carrot",
                        "date",
                        "eggplant",
                        "fig",
                        "grape",
                        "honey"));

        System.out.println("Set = " + vocab.getSet());
        System.out.println("First word: " + vocab.getFirstWord());
        System.out.println("Last word: " + vocab.getLastWord());

        String targetWord = "eggplant";
        SortedSet<String> wordsBefore = vocab.getWordsBefore(targetWord);
        System.out.println("Words before " + targetWord + ": " + wordsBefore);

        SortedSet<String> wordsAfter = vocab.getWordsAfter(targetWord);
        System.out.println("Words after " + targetWord + ": " + wordsAfter);

        String startWord = "carrot";
        String endWord = "grape";
        SortedSet<String> wordsBetween = vocab.getWordsBetween(startWord, endWord);
        System.out.println("Words between " + startWord + " and " + endWord + ": " + wordsBetween);
    }
}
