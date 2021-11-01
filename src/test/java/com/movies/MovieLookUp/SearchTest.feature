Feature: Is Ironman Endgame part 3 available to watch


  Scenario: Ironman Endgame part 3 is available
    Given that i am on the search page
    When I search for Ironman
    Then I should be told Ironman is available

  Scenario: Ironman Endgame part 3 is not available
    Given that i am on the search page
    When I search for Ironman
    Then I should be told "No, movie is not available"
