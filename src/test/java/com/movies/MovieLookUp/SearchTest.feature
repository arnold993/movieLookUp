Feature: Is Avengers Endgame part 3 available to watch
  As a web browser, I want to search for a movie to watch so then I can go and cinema it

  Scenario: Avengers Endgame part 3 is available
    Given that i am on the search page
    When I search for "Avengers Endgame part 3"
    Then I should be told "Avengers Endgame part 3" is available"

  Scenario: Avengers Endgame part 3 is not available
    Given that i am on the search page
    When I search for "Avengers Endgame part 3"
    Then I should be told "Avengers Endgame part 3 does not exist"


Feature: Can I leave a comment on a movie
  As a member and cinema goer, I want to make a review on a movie I watched so I can inform every one my thoughts

  Scenario: Leave review on a movie
    Given I am on the selected movie
    When I write a review on the title "Avengers Endgame Part 3"
    Then I should see the review added to the title "Avengers Endgame Part 3"


Feature: Add new movie for the database
  As a staff member, I want to a new movie named "Avengers Endgame part 3" to the database, so people know about it

  Scenario: Add "Avengers Endgame part 3" to the database
    Given I am on the form page
    And I fill all the fields
    When I select "add"
    Then I should be shown the movie added to the list

  Scenario: "Avengers Endgame part 3" not added to the database
    Given I am on the search page
    When I search for "Avengers Endgame part 3"
    Then I should be told "Movie not found"


Feature: What is the best movie now
  As a movie enthusiast, I want to look a movie with the best rating for a study

  Scenario: Search for movies with best rating
    Given I am on the search page
    And I select by "Order by top rating"
    When I select "search"
    Then I should be shown a list of movies ordered by rating


Feature: I want to remove "Avengers Endgame part 3"
  As a staff member, I want to remove "Avengers Endgame part 3" from the database so then I can

  Scenario: Delete "Avengers Endgame part 3"
    Given That I deleted "Avengers Endgame part 3"
    When I search for "Avengers Endgame part 3"
    Then No result should appear

