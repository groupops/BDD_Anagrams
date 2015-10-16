package com.epam.BDD_Anagrams;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class FileWordDictionary implements WordDictionary {

  private static final String DICTIONARY_FILE_PATH =
      "src/main/resources/wordlist.txt";

  private Set<String> dictionary;

  public FileWordDictionary() {
    dictionary = new HashSet<>();
    File dictionary_file = new File(DICTIONARY_FILE_PATH);
    try {
      BufferedReader buffered_reader =
          new BufferedReader(
              new InputStreamReader(
                  new FileInputStream(
                      dictionary_file
                  )
              )
          );
      String line = null;

      while ((line = buffered_reader.readLine()) != null) {
        dictionary.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public boolean containsWord(String word) {
    return dictionary.contains(word);
  }

}
