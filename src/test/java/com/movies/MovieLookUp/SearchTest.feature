Feature: Is Ironman Endgame part 3 available to watch
  As movie enthusiast, I want to search for a movie to watch at the cinema

  Scenario: Ironman Endgame part 3 is available
    Given that i am on the search page
    When I search for Ironman
    Then I should be told "Ironman Endgame part 3 is available"

  Scenario: Ironman Endgame part 3 is not available
    Given that i am on the search page
    When I search for Ironman
    Then I should be told "Ironman Endgame part 3 does not exist"


Feature: Can I leave a comment on a movie
  As cinema goer, I want to make a review on a movie I watched for everye one to know

  Scenario: Leave review on a movie
    Given I am on the selected movie
    When I write a review
    Then I should see a comment say "Thank you for your review"


Feature: Is Johnny Depp in any movie now
  As a fan of Johnny Depp, I want to see any some movies with as a main actor

  Scenario: Search for Johnny Depp
    Given I am on the search page
    And I selected search by actor
    When I search for "Johnny Depp"
    Then I should be show a list of movies

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

