package com.epam.BDD_Anagrams;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import java.util.List;

import static com.epam.BDD_Anagrams.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnagramSolverTest {

  private AnagramSolver anagramSolver;

  public AnagramSolverTest() {
  }

  @Test
  public void toAccountTest() throws Exception {
    aBehaviouralTestRunner().usingStepsFrom(this)
        .withStory("anagram_solver.story").run();
  }

  @Given("that I am using Anagram program")
  public void runAnagram() {
    anagramSolver = new AnagramSolver();
  }

  @When("I search all anagrams for the word $word")
  public void searchAllAnagramsFor(String word) {
    anagramSolver.searchAllAnagramsFor(word);
  }

  @Then("the anagrams: $expectedAnagrams are shown")
  public void getAllAnagrams(List<String> expectedAnagrams) {
    List<String> actualAnagrams = anagramSolver.getAllAnagrams();

    assertThat(actualAnagrams, is(equalTo(expectedAnagrams)));
  }

}
