Feature: Is Cider Desire available to watch
  As a web browser, I want to search for a movie to watch so then I can go and cinema it

  Scenario: "CIDER DESIRE" is available
    Given that i am on the search page
    When I search for "CIDER DESIRE"
    Then I should be told "CIDER DESIRE" is available

 # Scenario: CIDER DESIRE is not available
  #  Given that i am on the search page
   # When I search for "CIDER DESIRE"
    #Then I should be told CIDER DESIRE does not exist"