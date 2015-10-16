Get the longest set of anagrams for given word

Narrative:
In order to know the longest set of anagrams for given word
As a user
I want to list the longest set of anagrams for given word

Scenario: Stating that the word has no anagrams
Given that I am using Anagram program
When I search the dictionary for the word "an"
Then the anagrams: is shown

Scenario: Getting the set of anagrams for given word
Given that I am using Anagram program
When I search all anagrams for the word "pictures"
Then the anagrams: crepitus, cuprites, pictures, piecrust are shown