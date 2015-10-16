package com.epam.BDD_Anagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnagramSolver {

  private WordDictionary fileWordDictionary;
  private List<String> anagrams;
  private String word;

  public AnagramSolver() {
    fileWordDictionary = new FileWordDictionary();
  }

  public void searchAllAnagramsFor(String word) {
    anagrams = new ArrayList<>();
    findAllAnagrams(word);
    Collections.sort(anagrams);
  }

  public void findAllAnagrams(String word) {
    doAnagrams("", word);
  }

  private void doAnagrams(String prefix, String word) {
    if (word.length() == 0) {
      addIfInDictionary(prefix);
    } else {
      for (int i = 0; i < word.length(); i++) {
        doAnagrams(prefix + word.charAt(i),
            word.substring(0, i) + word.substring(i + 1));
      }
    }
  }

  private void addIfInDictionary(String word) {
    if (fileWordDictionary.containsWord(word)) {
      anagrams.add(word);
    }
  }

  public List<String> getAllAnagrams() {
    return anagrams;
  }

}
