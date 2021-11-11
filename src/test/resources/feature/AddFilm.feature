Feature: Add new movie for the database
  As a staff member, I want to a new movie called "Nemo" to the database, so people know about it

  Scenario: Successful addition to the database
    Given I know the name of the film
    When I add the movie with film id 1105, title "Batmann", description "a fish lost in the sea", year 2015, language id 2, duration 166,  rating "PG"
    Then The movie "Batmann" should appear in the database

  #Scenario: Attempt to add movie without film id
   # Given the film id has not been given
    #When I attempt to add the move to the database
    #Then I should be told "Film ID is missing"