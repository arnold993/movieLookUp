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
    When I write a review
    Then I should see a comment say "Thank you for your review"


Feature: Add new movie for the database
  As a staff member, I want to a new movie named "Avengers Endgame part 3" to the database, so people know about it

  Scenario: Add Avengers Endgame part 3 to the database
    Given I am on the form page
    And I fill all the fields
    When I select "add"
    Then I should be shown the movie added to the list

  Scenario: No movies with Johnny Depp
    Given I am on the search page
    And I selected search by actor
    When I search for "Johnny Depp"
    Then I should be told "there are no movies with Johnny Depp"


Feature: What is the best movie now
  As a movie enthusiast, I want to look a movie with the best rating for a study

  Scenario: Search for movies with best rating
    Given I am on the search page
    And I select by "Order by top rating"
    When I select "search"
    Then I should be shown a list of movies ordered by rating


Feature: I want to watch a movie released in 1988
  As a movie expert, I want to look for a movie released in 1988 for research purposes

  Scenario: Show list of movies released in 1988
    Given That I am on the search page
    And I select search by year
    When I select search
    Then I should be shown a list of movies released only in 1988

  Scenario: No movies released in 1988
    Given That I am on the search page
    And I select search by year
    When I select search
    Then I should be told "There are no movies in our database released in 1988"

