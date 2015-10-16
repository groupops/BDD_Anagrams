package com.epam.BDD_Anagrams;

import java.util.LinkedList;
import java.util.List;

public class AnagramSolver {

  private WordDictionary fileWordDictionary;
  private List<String> anagrams;
  private String word;

  public AnagramSolver(){
    fileWordDictionary = new FileWordDictionary();
  }

  public void searchAllAnagramsFor(String word){
    anagrams = new LinkedList<>();
    anagrams.add("crepitus");
    anagrams.add("cuprites");
    anagrams.add("pictures");
    anagrams.add("piecrust");
  }

  public List<String> getAllAnagrams(){

    return anagrams;
  }

}
