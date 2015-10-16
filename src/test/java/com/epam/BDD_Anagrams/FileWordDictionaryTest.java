package com.epam.BDD_Anagrams;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import static com.epam.BDD_Anagrams.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FileWordDictionaryTest {

  private WordDictionary fileWordDictionary;

  public FileWordDictionaryTest() {
  }

  @Test
  public void toAccountTest() throws Exception {
    aBehaviouralTestRunner().usingStepsFrom(this)
        .withStory("file_word_dictionary.story").run();
  }

  @Given("that I am using dictionary")
  public void runDictionary() {
    fileWordDictionary = new FileWordDictionary();
  }

  @When("I search the dictionary for the word $word")
  public void searchAllAnagramsFor(String word) {
    fileWordDictionary.containsWord(word);
  }

  @Then("stating that the word is in dictionary is $isWordInDictionary")
  public void isWordInDictionary(boolean isWordInDictionary) {
    boolean a = fileWordDictionary.containsWord("an");
    assertThat(a, is(equalTo(isWordInDictionary)));
  }

}
