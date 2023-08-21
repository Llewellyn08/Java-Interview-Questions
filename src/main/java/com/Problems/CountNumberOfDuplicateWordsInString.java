package com.Problems;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class CountNumberOfDuplicateWordsInString {

    public static void main(String[] args) {
        findDuplicateWords("Hey java is java best language is java");
        findDuplicateWords("Hey python is not java but best language is python not java");
    }

    public static void findDuplicateWords(String inputString){

        // Split the input string into words, converting to lowercase for uniformity
        String[] words = inputString.toLowerCase().split(" ");

        // Create a HashMap to store words and their occurrence count
        Map<String, Integer> wordCount = new HashMap<>();

        // Loop through each word in the given array
        for(String word: words){
            // Check if the word is already present in the map
            if(wordCount.containsKey(word)){
                // Increment the occurrence count
                wordCount.put(word, wordCount.get(word)+1);
            }
            else{
                // Add the word to the map with an occurrence count of 1
                wordCount.put(word, 1);
            }
        }

        // Extract all the keys (words) from the map
        Set<String> wordsInString = wordCount.keySet();

        // Loop through all the words in the map and print duplicate words along with their counts
        for(String word: wordsInString){
            if(wordCount.get(word)>1){
                System.out.println(word + ": " + wordCount.get(word));
            }
        }
    }
}
