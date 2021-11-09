Feature: Add new movie for the database
  As a staff member, I want to a new movie called "Nemo" to the database, so people know about it

  Scenario: Successful addition to the database
    Given The movie I want to add is named "Nemo"
    When I add the movie with film id 1105, title "Nemo", description "a fish lost in the sea", year 2015, language id 2, duration 166,  rating "PG"
    Then The new movie should be called "Nemo"

  Scenario: Attempt to add movie without film id
    Given the film id has not been given
    When I attempt to add the move to the database
    Then I should be told "Film ID is missing"