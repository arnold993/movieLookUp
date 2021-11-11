Feature: Is Cider Desire available to watch
  As a web browser, I want to search for a movie to watch so then I can go and cinema it

  Scenario: "CIDER DESIRE" is available
    Given the movie "CIDER DESIRE" is available
    When I search for "CIDER DESIRE"
    Then The movie should appear in the results

 # Scenario: CIDER DESIRE is not available
  #  Given that i am on the search page
   # When I search for "CIDER DESIRE"
    #Then I should be told CIDER DESIRE does not exist"